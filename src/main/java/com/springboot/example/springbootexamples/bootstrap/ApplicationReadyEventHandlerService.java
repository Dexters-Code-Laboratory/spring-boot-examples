package com.springboot.example.springbootexamples.bootstrap;

import com.springboot.example.springbootexamples.domain.Role;
import com.springboot.example.springbootexamples.domain.User;
import com.springboot.example.springbootexamples.enums.RoleType;
import com.springboot.example.springbootexamples.repoService.RoleRepoService;
import com.springboot.example.springbootexamples.repoService.UserRepoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class ApplicationReadyEventHandlerService implements ApplicationListener<ApplicationReadyEvent> {

    Log log = LogFactory.getLog(ApplicationReadyEventHandlerService.class);

    @Value("${skip.bootstrap:false}")
    Boolean skipBootstrap;

    private final UserRepoService userRepoService;

    private final RoleRepoService roleRepoService;

    public ApplicationReadyEventHandlerService(UserRepoService userRepoService, RoleRepoService roleRepoService) {
        this.userRepoService = userRepoService;
        this.roleRepoService = roleRepoService;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        if (skipBootstrap) {
            log.info("Bootstrap skipped as config property 'skip.bootstrap' is set to true");
        } else {
            createTestRole();
            createAdminUser();
        }
    }

    private void createAdminUser() {
        log.info("Admin user created");
        String emailId = "admin@admin.com";
        String username = "admin";
        if (userRepoService.countUserByEmailId(emailId) < 1) {
            User adminUser = new User("firstName", "lastName", emailId, new BCryptPasswordEncoder().encode("admin"), username);
            HashSet<Role> roleSet = new HashSet<Role>();
            roleSet.add(roleRepoService.findRoleByAuthority(RoleType.ROLE_ADMIN.name()));
            adminUser.setRoles(roleSet);
            userRepoService.save(adminUser);
        }
    }

    private void createTestRole() {
        if (roleRepoService.countRoleByAuthority(RoleType.ROLE_ADMIN.name()) < 1) {
            Role role1 = new Role();
            role1.setAuthority(RoleType.ROLE_ADMIN.name());
            roleRepoService.save(role1);
        }
        if (roleRepoService.countRoleByAuthority(RoleType.ROLE_USER.name()) < 1) {
            Role role2 = new Role();
            role2.setAuthority(RoleType.ROLE_USER.name());
            roleRepoService.save(role2);
        }
    }
}

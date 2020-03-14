package com.springboot.example.springbootexamples.repoService;

import com.springboot.example.springbootexamples.domain.domain.Role;
import com.springboot.example.springbootexamples.repository.RoleRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleRepoService extends BaseRepoService<Role, Long> {

    private final RoleRepository roleRepository;

    public RoleRepoService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    JpaRepository<Role, Long> getRepository() {
        return roleRepository;
    }

    public Long countRoleByAuthority(String authority) {
        return roleRepository.countByAuthority(authority);
    }

    public Role findRoleByAuthority(String authority) {
        return roleRepository.findByAuthority(authority);
    }
}

package com.springboot.example.springbootexamples.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity(name = "user")
public class User extends BaseEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String emailId;

    @Column(unique = true)
    private String username;

    private String firstName;

    private String lastName;

    private String mobileNumber;

    private String gender;

    private Date dateOfBirth;

    private String password;

    @Column(columnDefinition = "BIT default false")
    private boolean accountExpired = false;

    @Column(columnDefinition = "BIT default false")
    private boolean accountLocked = false;

    @Column(columnDefinition = "BIT default false")
    private boolean credentialsExpired = false;

    @Column(columnDefinition = "BIT default true")
    private boolean accountEnabled = true;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public User(String firstName, String lastName, String emailId, String password, String username) {
        this.emailId = emailId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public User() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return !accountExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !accountLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !credentialsExpired;
    }

    @Override
    public boolean isEnabled() {
        return accountEnabled;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}


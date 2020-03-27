package com.springboot.example.springbootexamples.repoService;

import com.springboot.example.springbootexamples.domain.User;
import com.springboot.example.springbootexamples.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRepoService extends BaseRepoService<User, Long> {
    private final UserRepository userRepository;

    @Autowired
    public UserRepoService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    JpaRepository<User, Long> getRepository() {
        return userRepository;
    }
//TODO Note:- Before adding any method here, please check if that method is present in its super class or not.
    // NOTE:- If you think that method may be required by multiple RepoServices,
    // NOTE:-  then add that method to the super class instead of here for better re-usability

    public User findUserByEmailId(String emailId) {
        return userRepository.findByEmailId(emailId);
    }

    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Long countUserByEmailId(String emailId) {
        return userRepository.countByEmailId(emailId);
    }
}

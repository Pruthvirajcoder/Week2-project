package com.PruthvirajPawar1.quizapp.service;

import com.PruthvirajPawar1.quizapp.model.User;
import com.PruthvirajPawar1.quizapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Collections;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    // User save करण्यासाठी method
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Username नुसार user शोधण्यासाठी helper method
    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    // Spring Security साठी mandatory method
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")) // minimum ROLE
        );
    }
}
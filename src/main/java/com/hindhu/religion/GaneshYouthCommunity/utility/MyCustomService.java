package com.hindhu.religion.GaneshYouthCommunity.utility;

import java.util.ArrayList;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hindhu.religion.GaneshYouthCommunity.entity.UserSignIn;
import com.hindhu.religion.GaneshYouthCommunity.repository.UserSignInRepo;
@Service
public class MyCustomService implements UserDetailsService {

    @Autowired
    private UserSignInRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserSignIn user = repo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                new ArrayList<>()
                
        );
    }
}

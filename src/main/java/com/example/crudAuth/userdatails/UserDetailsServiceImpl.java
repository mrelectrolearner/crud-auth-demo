package com.example.crudAuth.userdatails;

import com.example.crudAuth.collections.User;
import com.example.crudAuth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.getUserByUserName(username);
        if (user==null){
            throw new UsernameNotFoundException("username not found");
        }
        return new MyUserDetails(user);
    }
}

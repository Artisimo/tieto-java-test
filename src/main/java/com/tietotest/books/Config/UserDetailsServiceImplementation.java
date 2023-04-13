package com.tietotest.books.Config;

import com.tietotest.books.Model.User;
import com.tietotest.books.Model.UserDetailsImplementation;
import com.tietotest.books.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        System.out.println("**************************************************************");
        Optional<User> user = userRepository.findByUserName(userName);
        System.out.println(user.get().getRoles());
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

        return user.map(UserDetailsImplementation::new).get();
    }
}

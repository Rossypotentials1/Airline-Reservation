package com.rossypotentials.Airline.Reservation.System.infrastruture.config;

import com.rossypotentials.Airline.Reservation.System.infrastruture.exceptions.UsernameNotFoundException;
import com.rossypotentials.Airline.Reservation.System.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    private  final UserRepository userRepository;
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        return  username -> userRepository.findByEmail(username)
                .orElseThrow(()-> new UsernameNotFoundException("User not found")) ;
    }
}

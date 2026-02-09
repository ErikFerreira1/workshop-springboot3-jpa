package org.educandoweb.course.config;

import org.educandoweb.course.entities.User;

import org.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "99999999", "12345");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "888888888", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}

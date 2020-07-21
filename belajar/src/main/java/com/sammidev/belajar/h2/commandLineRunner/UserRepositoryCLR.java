package com.sammidev.belajar.h2.commandLineRunner;

import com.sammidev.belajar.h2.model.User;
import com.sammidev.belajar.h2.repository.UserRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserRepositoryCLR implements CommandLineRunner {
    private static final Logger log =  LoggerFactory.getLogger(UserRepositoryCLR.class);

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        User sammidev = new User("Sammidev", "Admin");
        userRepository.save(sammidev);
        log.info("-------------------------------");
        log.info("Finding all users");
        log.info("-------------------------------");
        for (User user : userRepository.findAll()) {
            log.info(user.toString());
        }

    }
}

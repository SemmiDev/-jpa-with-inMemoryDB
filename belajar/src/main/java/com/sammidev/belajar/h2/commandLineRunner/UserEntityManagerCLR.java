package com.sammidev.belajar.h2.commandLineRunner;

import com.sammidev.belajar.h2.model.User;
import com.sammidev.belajar.h2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class UserEntityManagerCLR implements CommandLineRunner {

    private static final Logger log =  LoggerFactory.getLogger(UserEntityManagerCLR.class);
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        log.info("-------------------------------");
        log.info("Adding Sam as Admin");
        log.info("-------------------------------");
        User sam = new User("Sam", "Admin");
        userService.insert(sam);
        log.info("Inserted Sam" + sam);

        log.info("-------------------------------");
        log.info("Finding user with id 1");
        log.info("-------------------------------");
        User user = userService.find(1L);
        log.info(user.toString());

        log.info("-------------------------------");
        log.info("Finding all users");
        log.info("-------------------------------");
        log.info(userService.findAll().toString());
    }
}

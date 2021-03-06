package com.learningJPAandHibernate.HibernateAndJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDaoService;

    @Override
    public void run(String... args) throws Exception {
        User tsige = new User("Tsigabu","Admin");
        long insert = userDaoService.insert(tsige);
        log.info("New User is Created"+tsige);

    }
}

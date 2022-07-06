package com.neu.jpa;

import com.neu.jpa.entity.User;
import com.neu.jpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootTest
class JpaApplicationTests {


    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {

        User user = new User();
        user.setAbout("aaa");
        user.setUsername("sss");
        user.setPassword("aaa");

        userRepository.save(user);

    }

}

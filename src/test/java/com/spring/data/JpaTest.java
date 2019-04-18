package com.spring.data;

import com.spring.data.model.User;
import com.spring.data.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private UserRepository userRepository;

    @Before
    public void before(){
        User user = new User();
        user.setFirstName("张");
        user.setLastName("三");

        userRepository.save(user);
    }

    @Test
    public void queryAll() {
        List<User> users = userRepository.findAll();
        log.info("result：{}",users);
    }
}

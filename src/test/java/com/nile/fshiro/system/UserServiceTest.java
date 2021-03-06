package com.nile.fshiro.system;

import com.nile.fshiro.system.domain.User;
import com.nile.fshiro.system.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findUserByNameTest() {
        User user = userService.findByName("allen");
        Assert.assertNotNull(user);
    }

}

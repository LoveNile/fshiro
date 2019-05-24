package com.nile.fshiro;

import com.nile.fshiro.system.dao.UserMapper;
import com.nile.fshiro.system.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FshiroApplicationTests {

    @Autowired
    private UserMapper tUserMapper;



    @Test
    public void contextLoads() {
        Long userId = 4L;
        User user = tUserMapper.selectByPrimaryKey(userId);
        System.out.println(user.getMobile());
    }

}

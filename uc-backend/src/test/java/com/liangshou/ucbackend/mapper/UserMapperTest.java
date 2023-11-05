
package com.liangshou.ucbackend.mapper;

import com.liangshou.ucbackend.model.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println("---------selectAll method test----------");
        if(userMapper == null){
            System.out.println("Null!");
            System.exit(-1);
        }

        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}
package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService  userServicer;

    @Test
    public void listRole() {
        JSONObject jsonObject = userServicer.listRole();
        System.out.println("listRole = " + jsonObject);
    }

    @Test
    public void listUser() {
        JSONObject jsonObject = userServicer.listUser(new JSONObject());
        System.out.println("listUser = " + jsonObject);
    }

    @Test
    public void listAllPermission() {
        JSONObject jsonObject = userServicer.listAllPermission();
        System.out.println("listAllPermission = " + jsonObject);
    }
}
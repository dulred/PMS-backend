package dev.dulred.pmsbackend.controller;

import dev.dulred.pmsbackend.entity.User;
import dev.dulred.pmsbackend.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class AdminController {

    @Resource
    AdminService adminService;

    @PostMapping(value = "/login")
    public String login(@RequestBody User user) {
        return adminService.login(user);
    }



}



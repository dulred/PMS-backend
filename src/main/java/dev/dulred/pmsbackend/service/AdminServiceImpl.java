package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.User;
import dev.dulred.pmsbackend.repository.AdminRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService{

    @Resource
    AdminRepository adminRepository;
    @Override
    public String login(User user) {

      User user1 = adminRepository.login(user);
        if (user1 != null){
            return "ok";
        }else {
            return "no";
        }


    }
}

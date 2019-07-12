package com.github.security.springsecurity.service;

import com.github.security.springsecurity.model.Login;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-11 17:25
 **/
@Service
public class LoginService {
    //@Resource
    private BCryptPasswordEncoder bCryptPasswordEncoder =  new BCryptPasswordEncoder();  //注入bcryct加密

    public Login findByUsername(String username) {
        Login login = new Login();

        login.setUsername(username);
        login.setPassword(bCryptPasswordEncoder.encode("123"));

        return login;
    }
}

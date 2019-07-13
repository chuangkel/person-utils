package com.github.security.springsecurity.service;

import com.github.security.springsecurity.model.Login;
import com.github.security.springsecurity.model.SysRole;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
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

        List<SysRole> list =  new ArrayList<>();
        SysRole sysRole = new SysRole();
        sysRole.setName("hello");
        list.add(sysRole);

        SysRole sysRole1 = new SysRole();
        sysRole1.setName("view");
        list.add(sysRole1);
        return login;
    }
}

package com.github.security.springsecurity.service;

import com.github.security.springsecurity.model.SysRole;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-11 17:26
 **/
@Service
public class RoleService {


    public List<SysRole> getRoles(Integer id) {
        List<SysRole> list =  new ArrayList<>();
        SysRole sysRole = new SysRole();
        sysRole.setName("role");
        list.add(sysRole);
        return list;
    }
}

package com.github.security.springsecurity.service;

import com.github.security.springsecurity.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-11 15:46
 **/
@Component
public class JwtUserDetailsService implements UserDetailsService {


    @Autowired
    private LoginService loginService;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("用户名为空");
        }
        Login login = loginService.findByUsername(username);
        Set<GrantedAuthority> authorities = new HashSet<>();
        roleService.getRoles(login.getId()).forEach(
                r -> authorities.add(new SimpleGrantedAuthority(r.getName())));

        return new User(
                login.getUsername(),
                login.getPassword(),
                true,//是否可用
                true,//是否过期
                true,//证书不过期为true
                true,//账户未锁定为true
                authorities);
    }
}

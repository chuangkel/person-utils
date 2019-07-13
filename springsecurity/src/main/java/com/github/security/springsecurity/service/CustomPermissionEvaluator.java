package com.github.security.springsecurity.service;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-12 11:04
 **/
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

@Configuration
public class CustomPermissionEvaluator implements PermissionEvaluator {
    private static final Logger log = LoggerFactory.getLogger(CustomPermissionEvaluator.class);
    //普通的targetDomainObject判断
    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        log.error("-------------------------------------");
        Collection<? extends GrantedAuthority> collection = authentication.getAuthorities();
        List<String> list = collection.stream().map(a->a.getAuthority()).collect(Collectors.toList());
        return list.contains(permission);
    }
    //用于ACL的访问控制
    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        log.error("-------------------------------------");
        return true;
    }
}

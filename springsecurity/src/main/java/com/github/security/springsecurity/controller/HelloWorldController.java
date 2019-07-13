package com.github.security.springsecurity.controller;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-11 15:31
 **/

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping({"/hello"})
    @PreAuthorize("authenticated and hasPermission('hello', 'view')")
    //@PreAuthorize("hasRole('view')")
    public String firstPage() {
        return "Hello World";
    }
}
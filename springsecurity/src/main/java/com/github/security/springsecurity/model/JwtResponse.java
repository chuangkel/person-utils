package com.github.security.springsecurity.model;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-11 15:42
 **/
import java.io.Serializable;
public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;
    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }
    public String getToken() {
        return this.jwttoken;
    }
}
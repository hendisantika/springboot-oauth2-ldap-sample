package com.hendisantika.springbootoauth2ldapsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-oauth2-ldap-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/05/20
 * Time: 04.49
 */
@RestController
@RequestMapping("/user")
public class DefaultRestController {

    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }
}

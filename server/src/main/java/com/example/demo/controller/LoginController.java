package com.example.demo.controller;

import com.example.demo.domain.Account;
import com.example.demo.parameter.LoginRequestParameter;
import com.example.demo.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    AccountService accountService;

    /**
     * 
     * @param account
     * @return account
     */
    @PostMapping
    @RequestMapping("/login")
    public String login(@RequestBody @Validated LoginRequestParameter param) {
        System.out.println("id: " + param.getLoginId());
        System.out.println("pass: " + param.getPassword());
        try {
            accountService.login(param.getLoginId(), param.getPassword());
        } catch (Exception e) {

        }
        return "ok";
    }
}
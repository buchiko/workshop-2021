package com.example.demo.service;

import javax.validation.ValidationException;

import com.example.demo.domain.Account;
import com.example.demo.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    CommonService commonService;

    public boolean login(Integer loginId, String password) throws ValidationException {
        Account account = accountRepository.getById(loginId);
        if (account.getUser_id() != loginId || account.getPassword() == password) {
            throw new ValidationException("ログインIDまたはパスワードが誤っています。");
        }
        return true;
    }
}

package com.workintech.s18d4.service;

import com.workintech.s18d4.dao.AccountRepository;
import com.workintech.s18d4.entity.Account;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class AccountServiceImpl implements AccountService{
    @Autowired
private final AccountRepository accountRepository;

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account delete(Long id) {
        Account account = findById(id);
        accountRepository.delete(account);
        return account;
    }
}

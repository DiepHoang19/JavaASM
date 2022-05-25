package com.example.accoutmodel.model;

import com.example.accoutmodel.entity.Account;

import java.util.List;

public interface AccountModel {
    boolean save(Account account);
    boolean update(int id, Account account);
    boolean delete(int id);
    Account findById(int id);
    List<Account> findAll();
}

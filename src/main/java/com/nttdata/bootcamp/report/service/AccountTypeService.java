package com.nttdata.bootcamp.report.service;

import com.nttdata.bootcamp.report.model.document.AccountType;

import java.util.List;

public interface AccountTypeService {

    void insert(AccountType accountType);

    void update(AccountType accountType);

    void delete(String id);

    void deleteAll();

    AccountType findById(String id);

    List<AccountType> findAll();

}

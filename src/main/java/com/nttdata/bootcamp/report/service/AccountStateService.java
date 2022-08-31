package com.nttdata.bootcamp.report.service;

import com.nttdata.bootcamp.report.model.document.AccountState;

import java.util.List;

public interface AccountStateService {

    void insert(AccountState accountState);

    void update(AccountState accountState);

    void delete(String id);

    void deleteAll();

    AccountState findById(String id);

    List<AccountState> findAll();

}

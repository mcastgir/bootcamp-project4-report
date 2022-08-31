package com.nttdata.bootcamp.report.model.repository;

import com.nttdata.bootcamp.report.model.document.AccountState;

import java.util.Map;

public interface AccountStateRepository {

    void save(AccountState accountState);

    void delete(String id);

    void deleteAll();

    AccountState findById(String id);

    Map<String, AccountState> findAll();

}

package com.nttdata.bootcamp.report.service.impl.mongo;

import com.nttdata.bootcamp.report.model.dao.AccountStateDao;
import com.nttdata.bootcamp.report.model.document.AccountState;
import com.nttdata.bootcamp.report.service.AccountStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AccountStateServiceMongoImpl")
public class AccountStateServiceImpl implements AccountStateService {

    @Autowired
    private AccountStateDao accountStateDao;

    @Override
    public void insert(AccountState accountState) {

    }

    @Override
    public void update(AccountState accountState) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public AccountState findById(String id) {
        return null;
    }

    @Override
    public List<AccountState> findAll() {
        throw  new RuntimeException("");
        /*return accountStateDao.findAll();*/
    }

}

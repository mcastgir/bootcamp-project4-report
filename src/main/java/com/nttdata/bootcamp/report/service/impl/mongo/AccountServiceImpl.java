package com.nttdata.bootcamp.report.service.impl.mongo;

import com.nttdata.bootcamp.report.model.dao.AccountDao;
import com.nttdata.bootcamp.report.model.document.Account;
import com.nttdata.bootcamp.report.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

}

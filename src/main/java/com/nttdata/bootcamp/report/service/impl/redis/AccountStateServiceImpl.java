package com.nttdata.bootcamp.report.service.impl.redis;

import com.nttdata.bootcamp.report.model.document.AccountState;
import com.nttdata.bootcamp.report.model.repository.AccountStateRepository;
import com.nttdata.bootcamp.report.service.AccountStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("AccountStateServiceRedisImpl")
public class AccountStateServiceImpl implements AccountStateService {

    @Autowired
    private AccountStateRepository accountStateRepository;

    @Override
    public void insert(AccountState accountState) {
        accountStateRepository.save(accountState);
    }

    @Override
    public void update(AccountState accountState) {
        accountStateRepository.save(accountState);
    }

    @Override
    public void delete(String id) {
        accountStateRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        accountStateRepository.deleteAll();
    }

    @Override
    public AccountState findById(String id) {
        return accountStateRepository.findById(id);
    }

    @Override
    public List<AccountState> findAll() {
        return accountStateRepository.findAll()
                .values().stream()
                .collect(Collectors.toList());
    }
}

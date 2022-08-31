package com.nttdata.bootcamp.report.service.impl.jpa;

import com.nttdata.bootcamp.report.model.document.AccountType;
import com.nttdata.bootcamp.report.model.document.MovementType;
import com.nttdata.bootcamp.report.model.repository.AccountTypeRepository;
import com.nttdata.bootcamp.report.service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("AccountStateServiceJPAImpl")
public class AccountTypeServiceImpl implements AccountTypeService {

    @Autowired
    private AccountTypeRepository accountTypeRepository;

    @Override
    public void insert(AccountType accountType) {
        accountTypeRepository.save(accountType);
    }

    @Override
    public void update(AccountType accountType) {
        accountTypeRepository.save(accountType);
    }

    @Override
    public void delete(String id) {
        accountTypeRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        accountTypeRepository.deleteAllInBatch();
    }

    @Override
    public AccountType findById(String id) {
        Optional<AccountType> optionalAccountType = accountTypeRepository.findById(id);
        if(optionalAccountType.isPresent()){
            return optionalAccountType.get();
        } else {
            throw new RuntimeException("No existe Tipo de Cuenta");
        }
    }

    @Override
    public List<AccountType> findAll() {
        List<AccountType> list = new ArrayList<>();
        accountTypeRepository.findAll().forEach(list::add);
        return list;
    }
}

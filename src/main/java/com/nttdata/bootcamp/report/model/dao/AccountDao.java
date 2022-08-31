package com.nttdata.bootcamp.report.model.dao;

import com.nttdata.bootcamp.report.model.document.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountDao extends MongoRepository<Account, String> {

}

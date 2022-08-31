package com.nttdata.bootcamp.report.model.dao;

import com.nttdata.bootcamp.report.model.document.AccountState;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountStateDao extends MongoRepository<AccountState, String> {

}

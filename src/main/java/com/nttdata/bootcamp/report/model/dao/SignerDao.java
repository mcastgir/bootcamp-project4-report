package com.nttdata.bootcamp.report.model.dao;

import com.nttdata.bootcamp.report.model.document.Signer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SignerDao extends MongoRepository<Signer, String> {

}

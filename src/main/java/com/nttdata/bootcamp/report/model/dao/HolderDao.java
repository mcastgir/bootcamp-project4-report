package com.nttdata.bootcamp.report.model.dao;

import com.nttdata.bootcamp.report.model.document.Holder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HolderDao extends MongoRepository<Holder, String> {

}

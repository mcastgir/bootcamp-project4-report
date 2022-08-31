package com.nttdata.bootcamp.report.model.dao;

import com.nttdata.bootcamp.report.model.document.MovementType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovementTypeDao extends MongoRepository<MovementType, String> {

}

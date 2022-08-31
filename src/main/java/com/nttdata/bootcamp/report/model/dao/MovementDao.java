package com.nttdata.bootcamp.report.model.dao;

import com.nttdata.bootcamp.report.model.document.Movement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovementDao extends MongoRepository<Movement, String> {

}

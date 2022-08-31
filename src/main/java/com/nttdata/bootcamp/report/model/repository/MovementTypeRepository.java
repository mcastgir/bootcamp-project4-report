package com.nttdata.bootcamp.report.model.repository;

import com.nttdata.bootcamp.report.model.document.MovementType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementTypeRepository extends CrudRepository<MovementType, String> {

}

package com.nttdata.bootcamp.report.service;

import com.nttdata.bootcamp.report.model.document.MovementType;

import java.util.List;

public interface MovementTypeService {

    void insert(MovementType movementType);

    void update(MovementType movementType);

    void delete(String id);

    void deleteAll();

    MovementType findById(String id);

    public List<MovementType> findAll();

}

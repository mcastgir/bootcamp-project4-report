package com.nttdata.bootcamp.report.service.impl.mongo;

import com.nttdata.bootcamp.report.model.dao.MovementTypeDao;
import com.nttdata.bootcamp.report.model.document.MovementType;
import com.nttdata.bootcamp.report.service.MovementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementTypeServiceImpl implements MovementTypeService {

    @Autowired
    private MovementTypeDao movementTypeDao;

    @Override
    public void insert(MovementType movementType) {

    }

    @Override
    public void update(MovementType movementType) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public MovementType findById(String id) {
        return null;
    }

    @Override
    public List<MovementType> findAll() {
        return movementTypeDao.findAll();
    }

}

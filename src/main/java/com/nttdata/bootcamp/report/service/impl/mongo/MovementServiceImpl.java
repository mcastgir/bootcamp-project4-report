package com.nttdata.bootcamp.report.service.impl.mongo;

import com.nttdata.bootcamp.report.model.dao.MovementDao;
import com.nttdata.bootcamp.report.model.document.Movement;
import com.nttdata.bootcamp.report.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementServiceImpl implements MovementService {

    @Autowired
    private MovementDao movementDao;

    @Override
    public List<Movement> findAll() {
        return movementDao.findAll();
    }

}

package com.nttdata.bootcamp.report.service.impl.redis;

import com.nttdata.bootcamp.report.model.document.MovementType;
import com.nttdata.bootcamp.report.model.repository.MovementTypeRepository;
import com.nttdata.bootcamp.report.service.MovementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("MovementTypeServiceRedisImpl")
public class MovementTypeServiceImpl implements MovementTypeService {

    @Autowired
    private MovementTypeRepository movementTypeRepository;

    @Override
    public void insert(MovementType movementType) {
        movementTypeRepository.save(movementType);
    }

    @Override
    public void update(MovementType movementType) {
        movementTypeRepository.save(movementType);
    }

    @Override
    public void delete(String id) {
        movementTypeRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        movementTypeRepository.deleteAll();
    }

    @Override
    public MovementType findById(String id) {
        Optional<MovementType> optionalMovementType = movementTypeRepository.findById(id);
        if(optionalMovementType.isPresent()){
            return optionalMovementType.get();
        } else {
            throw new RuntimeException("No existe Tipo de Movimiento");
        }
    }

    @Override
    @Cacheable(value = "accountTypeCache")
    public List<MovementType> findAll() {
        List<MovementType> list = new ArrayList<>();
        movementTypeRepository.findAll().forEach(list::add);
        return list;
    }
}

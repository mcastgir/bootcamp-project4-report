package com.nttdata.bootcamp.report.controller;

import com.nttdata.bootcamp.report.model.document.MovementType;
import com.nttdata.bootcamp.report.service.MovementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/report/movementtypes")
public class MovementTypeController {

    @Autowired
    @Qualifier("MovementTypeServiceRedisImpl")
    private MovementTypeService movementTypeService;

    @GetMapping
    public ResponseEntity<List<MovementType>> findAll() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(this.movementTypeService.findAll());
    }

}

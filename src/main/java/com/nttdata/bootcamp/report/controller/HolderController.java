package com.nttdata.bootcamp.report.controller;

import com.nttdata.bootcamp.report.model.document.Holder;
import com.nttdata.bootcamp.report.service.HolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/report/holders")
public class HolderController {

    @Autowired
    private HolderService holderService;

    @GetMapping
    public ResponseEntity<List<Holder>> findAll() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(this.holderService.findAll());
    }

}

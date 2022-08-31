package com.nttdata.bootcamp.report.controller;

import com.nttdata.bootcamp.report.model.document.Signer;
import com.nttdata.bootcamp.report.service.SignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/report/signers")
public class SignerController {

    @Autowired
    private SignerService signerService;

    @GetMapping
    public ResponseEntity<List<Signer>> findAll() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(this.signerService.findAll());
    }

}

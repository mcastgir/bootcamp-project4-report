package com.nttdata.bootcamp.report.controller;

import com.nttdata.bootcamp.report.model.document.AccountType;
import com.nttdata.bootcamp.report.service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/report/accounttypes")
public class AccounTypeController {

    @Autowired
    @Qualifier("AccountStateServiceJPAImpl")
    private AccountTypeService accountTypeService;

    @GetMapping
    public ResponseEntity<List<AccountType>> findAll() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(this.accountTypeService.findAll());
    }

}

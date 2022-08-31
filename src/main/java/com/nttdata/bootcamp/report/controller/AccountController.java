package com.nttdata.bootcamp.report.controller;

import com.nttdata.bootcamp.report.model.document.Account;
import com.nttdata.bootcamp.report.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/report/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> findAll() {
        return ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(this.accountService.findAll());
    }

}

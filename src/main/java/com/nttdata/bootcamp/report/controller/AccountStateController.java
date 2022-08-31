package com.nttdata.bootcamp.report.controller;

import com.nttdata.bootcamp.report.model.document.AccountState;
import com.nttdata.bootcamp.report.service.AccountStateService;
import com.nttdata.bootcamp.report.service.impl.redis.AccountStateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/report/accountstates")
public class AccountStateController {

    @Autowired
    @Qualifier("AccountStateServiceRedisImpl")
    private AccountStateService accountStateService;

    @GetMapping
    public ResponseEntity<List<AccountState>> findAll() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(this.accountStateService.findAll());
    }

}

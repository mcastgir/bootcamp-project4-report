package com.nttdata.bootcamp.report.service;

import com.nttdata.bootcamp.report.model.dao.AccountDao;
import com.nttdata.bootcamp.report.model.document.Account;
import com.nttdata.bootcamp.report.service.impl.mongo.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountServiceTest {

    @Mock
    private AccountDao accountDao;
    @InjectMocks
    private AccountService accountService = new AccountServiceImpl();

    @Test
    void findAll() {
        /* Builder Object */
        List<Account> accounts = Arrays.asList(Account.builder()
                .id("62f3c061fd86d650c1e49661")
                .accountNumber("433a3cf3-88ac-465f-b955-cdeb7272b4c6")
                .accountInterbankNumber("3b6659fc-7017-4efe-beec-8cd89191f27a")
                .codeClient("CLIE-0001")
                .codeProduct("CTA-PLZ")
                .dateRegister(new Date())
                .creditLine(0.0)
                .availableAmount(0.0)
                .codeAccountState("RA")
                .amountMinimunOpen(0.0)
                .build());
        Mockito.when(accountDao.findAll()).thenReturn(accounts);
        assertEquals(1, accountService.findAll().size());
        Mockito.verify(accountDao, Mockito.times(1)).findAll();
    }

}
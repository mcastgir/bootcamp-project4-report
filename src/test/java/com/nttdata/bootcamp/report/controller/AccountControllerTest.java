package com.nttdata.bootcamp.report.controller;

import com.nttdata.bootcamp.report.model.document.Account;
import com.nttdata.bootcamp.report.util.StringUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AccountControllerTest {

    private static final String URI_ACCOUNT = "http://localhost:{port}/api/report/accounts";

    @Autowired
    private TestRestTemplate testRestTemplate;
    @LocalServerPort
    private int port;

    @Test
    void findAll() {
        /* Headers */
        HttpHeaders headers = new HttpHeaders();
        headers.set("accept", "application/json");
        /* Response Entity */
        HttpEntity requestEntity = new HttpEntity<>(null, headers);
        ResponseEntity<List<Account>> response = testRestTemplate
                .exchange(URI_ACCOUNT.replace("{port}", StringUtil.toString(port)),
                        HttpMethod.GET,
                        requestEntity,
                        new ParameterizedTypeReference<List<Account>>() {});
        /* Verify response */
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}
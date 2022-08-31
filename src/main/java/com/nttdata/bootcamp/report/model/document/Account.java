package com.nttdata.bootcamp.report.model.document;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@ToString
@Document(collection="account")
public class Account {

    @Id
    private String id;
    private String accountNumber;
    private String accountInterbankNumber;
    private String codeClient;
    private String codeProduct;
    private Date dateRegister;
    private double creditLine;
    private double availableAmount;
    private String codeAccountState;
    private double amountMinimunOpen;
    private String accountType;


}

package com.nttdata.bootcamp.report.model.document;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@ToString
@Document(collection="movement")
public class Movement {

    @Id
    private String id;
    private String code;
    private String accountNumber;
    private String accountNumberDestination;
    private Date dateRegister;
    private String codeMovementType;
    private double previousAmount;
    private double movementAmount;
    private double finalAmount;

}

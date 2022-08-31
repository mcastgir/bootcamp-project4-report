package com.nttdata.bootcamp.report.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="account_state")
public class AccountState implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String code;
    private String name;
    private boolean state;

}

package com.nttdata.bootcamp.report.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "account_type")
public class AccountType {

    @Id
    @Column(name = "id_account_type", unique = true)
    private Integer idAccountType;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "state", nullable = false)
    private Boolean state;

}

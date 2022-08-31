package com.nttdata.bootcamp.report.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="movement_type")
public class MovementType implements Serializable {

    @Id
    private String id;
    private String code;
    private String name;
    private String operationType;
    private boolean state;

}

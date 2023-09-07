package com.bootcamp.passiveProduct.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Document(collection = "customers")
public class Customer extends AuditableEntity{

    @Id
    private String id;

    @NotNull
    private String name;

    @NotNull
    private String lastName;

    @NotNull
    private String documentType;

    @NotNull
    private String documentNumber;

    @NotNull
    private String internalCode;

}

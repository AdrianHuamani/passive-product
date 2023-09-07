package com.bootcamp.passiveProduct.domain;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Document(collection = "debitCard")
public class DebitCard {

	@Id
	private String id;

	private String cardNumber;
	
	private String customerInternalCode;

	private LocalDate expiryDate;

	private Integer cvv;

	private String cardType;

	private String status;

	private List<Account> accounts;

}

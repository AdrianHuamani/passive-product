package com.bootcamp.passiveProduct.web.contracts;

import com.bootcamp.passiveProduct.domain.Account;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DebitCardResponse {

    @Id
    private String cardNumber;

    private String customerInternalCode;

    private LocalDate expiryDate;

    private Integer cvv;

    private String cardType;

    private String status;

    private List<Account> accounts;

}

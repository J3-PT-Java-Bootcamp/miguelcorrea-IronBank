package com.ironhack.ironbank.DTO;

import com.ironhack.ironbank.helpclasses.AccountStatus;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;


@Getter
public class CreditDTO {

    UUID accountID;
    UUID secretKey;

    String primaryOwnerId;
    String secondaryOwnerId;

    String balance;
    String creditLimit;
    String interestRate;

    LocalDate creationDate;
    AccountStatus accountStatus;


}
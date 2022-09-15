package com.ironhack.ironbank.users.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountHolderDTO {
    String id;
    String username;
    String password;
    String email;
    String firstname;
    String lastname;
    Date dateOfBirth;
    String street;
    String number;
    String floor;
    String postalCode;
    String city;
    String land;

}

package com.ironhack.ironbank.controller;


import com.ironhack.ironbank.DTO.AccountsDTO;
import com.ironhack.ironbank.config.KeycloakProvider;
import com.ironhack.ironbank.model.AccountHolder;
import com.ironhack.ironbank.service.AccountHolderService;
import lombok.extern.java.Log;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.security.Principal;


@RestController
@Log
@RequestMapping("/accountholder")
public class AccountHolderController {

    final
    AccountHolderService accountHolderService;
    final
    KeycloakProvider kcProvider;

    public AccountHolderController(AccountHolderService accountHolderService, KeycloakProvider kcProvider) {
        this.accountHolderService = accountHolderService;
        this.kcProvider = kcProvider;
    }

    @GetMapping("/user")
    public ResponseEntity<AccountHolder> getByUsername(Principal principal) {
        //todo: accounts should be visible too
        return ResponseEntity.ok(accountHolderService.getByUsername(principal.getName()));
    }

    @GetMapping("/accounts")
    public ResponseEntity<AccountsDTO> getCheckings(Principal principal) {
        var userId = accountHolderService.getByUsername(principal.getName()).getId();
                //todo: accounts should be visible too
        return ResponseEntity.ok(accountHolderService.getAccounts(userId));
    }

    @GetMapping("/account/{accountId}")
    public ResponseEntity<String> getCheckings(@PathVariable String accountId, Principal principal) {
        var userId = accountHolderService.getByUsername(principal.getName()).getId();
        //todo: accounts should be visible too
        return accountHolderService.getAccountById(userId, accountId);
    }



}

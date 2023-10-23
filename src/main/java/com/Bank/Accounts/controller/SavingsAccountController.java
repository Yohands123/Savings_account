package com.Bank.Accounts.controller;

import com.Bank.Accounts.dto.SavingAccountdto;
import com.Bank.Accounts.model.SavingAccount;
import com.Bank.Accounts.service.SavingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/savings")
public class SavingsAccountController {
    @Autowired
    private SavingService savingService;

    @PostMapping("/create")
    public ResponseEntity<SavingAccount> createSavingAccount(@RequestBody @Valid SavingAccountdto savingAccountdto){
        return  new ResponseEntity<>(savingService.createSavingAccount(savingAccountdto), HttpStatus.CREATED);
    }



}

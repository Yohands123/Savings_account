package com.Bank.Accounts.controller;

import com.Bank.Accounts.dto.SavingAccountdto;
import com.Bank.Accounts.model.SavingAccount;
import com.Bank.Accounts.service.SavingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/savings")
public class SavingsAccountController {
    @Autowired
    private SavingService savingService;

    @PostMapping("/create")
    public ResponseEntity<SavingAccount> createSavingAccount(@RequestBody @Valid SavingAccountdto savingAccountdto){
        return  new ResponseEntity<>(savingService.createSavingAccount(savingAccountdto), HttpStatus.CREATED);
    }
   @GetMapping("/fetchall")
    public ResponseEntity<List<SavingAccount>> getAllSavingAccounts(){
        return ResponseEntity.ok(savingService.getAllSavingAccounts());
   }
    @GetMapping("/fetch/{id}")
    public ResponseEntity<SavingAccount> getSavingAccountById(@PathVariable("id") int id){
        return ResponseEntity.ok(savingService.getSavingAccountById(id));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteSavingAccountById(@PathVariable("id") int id){
        return ResponseEntity.ok(savingService.deleteSavingAccountById(id));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<SavingAccount> updateSavingAccountById(@PathVariable("id") int id, @RequestBody @Valid SavingAccountdto savingAccountdto){
        return ResponseEntity.ok(savingService.updateSavingAccountById(id,savingAccountdto));
    }



}

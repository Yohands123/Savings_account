package com.Bank.Accounts.service;

import com.Bank.Accounts.dto.SavingAccountdto;
import com.Bank.Accounts.model.SavingAccount;
import com.Bank.Accounts.repository.savingsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingService {
    @Autowired
    private savingsrepo repo;
    public SavingAccount createSavingAccount(SavingAccountdto savingAccountdto)
    {
        SavingAccount savingAccount=new SavingAccount();
        savingAccount.setId(0);
        savingAccount.setAccountnumber(savingAccountdto.getAccountnumber());
        savingAccount.setAccountholdername(savingAccountdto.getAccountholdername());
        savingAccount.setEmail(savingAccountdto.getEmail());
        savingAccount.setPhonenumber(savingAccountdto.getPhonenumber());
        savingAccount.setAmount(savingAccountdto.getAmount());
        savingAccount.setAddress(savingAccountdto.getAddress());


        return repo.save(savingAccount);
    }
}

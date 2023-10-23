package com.Bank.Accounts.repository;

import com.Bank.Accounts.model.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface savingsrepo extends JpaRepository<SavingAccount,Integer> {
}

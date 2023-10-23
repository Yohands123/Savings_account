package com.Bank.Accounts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "savingaccounts")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SavingAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String accountnumber;
    public String accountholdername;
    public String email;
    public String phonenumber;
    public double amount;
    public String address;


}

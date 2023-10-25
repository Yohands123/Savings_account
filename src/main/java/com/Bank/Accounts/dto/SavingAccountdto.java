package com.Bank.Accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SavingAccountdto {
    @Pattern(regexp = "^[0-9]{12}$",message = "enter valid account number")
    public String accountnumber;
    @NotBlank
    public String accountholdername;
    @Email(message = "invalid emailid")
    public String email;
    @Pattern(regexp = "^[0-9]{10}$",message = "phone number is invalid")
   
    public String phonenumber;
    @Min(0)
    @Max(1000000000)
    public double amount;
    @NotBlank
    public String address;
}

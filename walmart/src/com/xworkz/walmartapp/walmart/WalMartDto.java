package com.xworkz.walmartapp.walmart;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class WalMartDto {
    private String emailId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String passWord;

    public String toString()
    {
        return "WalMartDto{\nEmailId : "+emailId+"\nFirstName : "+firstName+"\nLastName : "+lastName+"\nPhone Number : "+phoneNumber+"\nPassword : "+passWord+"}";
    }


}

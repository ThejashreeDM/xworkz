package com.xworkz.ebayapp.ebay;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EbayDto {
    private String firstName;
    private String lastName;
    private String email;
    private String passWord;
    private String confirmPassWord;
    public String toString()
    {
        return "EbayDto{\nFirst Name : "+firstName+"\nLast Name "+lastName+"\nEmail "+email+"\nPassword : "+passWord+"\nConfirm Password : "+confirmPassWord+"}";
    }


}

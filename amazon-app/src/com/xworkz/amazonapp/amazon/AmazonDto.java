package com.xworkz.amazonapp.amazon;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AmazonDto {
    private String emailId;
    private String phoneNumber;
    private String fullName;
    private String password;
    private String confirmPassword ;

    @Override
    public String toString()
    {
        return "AmazonDto{\nEmail Id : "+emailId+"\nPhone Number : "+phoneNumber+"\nFull Name : "+fullName+"\nPassword : "+password+"\nConfirm Password : "+confirmPassword+"}";
    }

}

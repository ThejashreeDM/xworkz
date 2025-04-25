package com.xworkz.walmartapp.walmart;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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

    public boolean equals(Object obj) {
        if (obj instanceof WalMartDto) {
            WalMartDto child = (WalMartDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId, firstName, lastName, phoneNumber, passWord);
    }
}

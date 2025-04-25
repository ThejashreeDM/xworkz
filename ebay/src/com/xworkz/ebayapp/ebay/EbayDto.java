package com.xworkz.ebayapp.ebay;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        if (obj instanceof EbayDto) {
            EbayDto child = (EbayDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, passWord, confirmPassWord);
    }
}

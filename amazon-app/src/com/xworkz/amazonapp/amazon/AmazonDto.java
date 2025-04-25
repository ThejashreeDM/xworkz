package com.xworkz.amazonapp.amazon;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        if (obj instanceof AmazonDto) {
            AmazonDto child = (AmazonDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId, phoneNumber, fullName, password, confirmPassword);
    }
}

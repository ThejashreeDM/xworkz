package com.xworkz.tostring.lenskart;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class LensKartDto
{
    private String lenskartId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "LenskartDto{\n" + "Id : " + lenskartId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof LensKartDto)
        {
            LensKartDto child=(LensKartDto) obj;
            if(this.hashCode() == child.hashCode())
            {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(lenskartId, userName, email, password, confirmPassword, contactNumber);
    }
}

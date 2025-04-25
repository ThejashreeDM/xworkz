package com.xworkz.tostring.esty;

import com.xworkz.tostring.craftsvilla.CraftsVillaDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor

public class EtsyDto
{
    private String etsyId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "EtsyDto{\n" + "Id : " + etsyId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof EtsyDto) {
            EtsyDto etsy = (EtsyDto) obj;
            if (this.etsyId == etsy.etsyId && this.userName == etsy.userName && this.email == etsy.email && this.password == etsy.password && this.confirmPassword == etsy.confirmPassword && this.contactNumber == etsy.contactNumber)
                return true;
        }
        return  false;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(etsyId ,userName , email ,password ,confirmPassword ,contactNumber);
    }


}

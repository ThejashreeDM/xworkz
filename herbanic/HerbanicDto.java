package com.xworkz.tostring.herbanic;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class HerbanicDto {
    private String herbanicId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "HerbanicDto{\n" + "Id : " + herbanicId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof HerbanicDto)
        {
            HerbanicDto child=(HerbanicDto) obj;
            if(this.hashCode() == child.hashCode())
            {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(herbanicId, userName, email, password, confirmPassword, contactNumber);
    }
}
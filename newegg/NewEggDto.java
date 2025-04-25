package com.xworkz.tostring.newegg;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class NewEggDto
{
    private String newEggId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "NewEggDto{\n" + "Id : " + newEggId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof NewEggDto)
        {
            NewEggDto child=(NewEggDto) obj;
            if(this.hashCode() == child.hashCode())
            {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(newEggId, userName, email, password, confirmPassword, contactNumber);
    }
}

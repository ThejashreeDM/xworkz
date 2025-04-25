package com.xworkz.tostring.jiomart;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class JioMartDto
{
    private String jiomartId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "JioMartDto{\n" + "Id : " + jiomartId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof JioMartDto)
        {
            JioMartDto child=(JioMartDto) obj;
            if(this.hashCode() == child.hashCode())
            {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(jiomartId, userName, email, password, confirmPassword, contactNumber);
    }
}

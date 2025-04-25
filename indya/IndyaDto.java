package com.xworkz.tostring.indya;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class IndyaDto
{
    private String indyaId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "IndyaDto{\n" + "Id : " + indyaId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof IndyaDto)
        {
            IndyaDto child=(IndyaDto) obj;
            if(this.hashCode() == child.hashCode())
            {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(indyaId, userName, email, password, confirmPassword, contactNumber);
    }
}

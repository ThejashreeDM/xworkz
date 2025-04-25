package com.xworkz.tostring.shein;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor

public class SheinDto
{
    private String sheinId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "SheinDto{\n" + "Id : " + sheinId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SheinDto) {
            SheinDto child = (SheinDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(sheinId, userName, email, password, confirmPassword, contactNumber);
    }
}

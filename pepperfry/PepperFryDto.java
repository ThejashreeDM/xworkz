package com.xworkz.tostring.pepperfry;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class PepperFryDto
{
    private String pepperfryId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "PepperfryDto{\n" + "Id : " + pepperfryId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PepperFryDto) {
            PepperFryDto child = (PepperFryDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(pepperfryId, userName, email, password, confirmPassword, contactNumber);
    }
}

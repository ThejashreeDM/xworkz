package com.xworkz.tostring.woovly;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class WoovlyDto
{
    private String woovlyId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "WoovlyDto{\n" + "Id : " + woovlyId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof WoovlyDto) {
            WoovlyDto child = (WoovlyDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(woovlyId, userName, email, password, confirmPassword, contactNumber);
    }
}

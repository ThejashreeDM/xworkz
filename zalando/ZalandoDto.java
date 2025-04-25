package com.xworkz.tostring.zalando;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class ZalandoDto
{
    private String zalandoId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "ZalandoDto{\n" + "Id : " + zalandoId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ZalandoDto) {
            ZalandoDto child = (ZalandoDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(zalandoId, userName, email, password, confirmPassword, contactNumber);
    }
}

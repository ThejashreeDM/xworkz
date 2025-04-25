package com.xworkz.tostring.overstock;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class OverStockDto
{
    private String overStockId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "OverStock{\n" +
                "Id : " + overStockId +
                "\nUser Name : " + userName +
                "\nEmail : " + email +
                "\nPassword : " + password +
                "\nConfirm Password : " + confirmPassword +
                "\nContact Number : " + contactNumber +
                "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OverStockDto) {
            OverStockDto child = (OverStockDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(overStockId, userName, email, password, confirmPassword, contactNumber);
    }
}

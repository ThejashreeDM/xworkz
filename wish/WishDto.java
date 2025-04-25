package com.xworkz.tostring.wish;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class WishDto {
    private String wishId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "WishDto{\n" +"Id : " + wishId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof WishDto) {
            WishDto child = (WishDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(wishId, userName, email, password, confirmPassword, contactNumber);
    }
}

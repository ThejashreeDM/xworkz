package com.xworkz.tostring.shopclues;


import com.xworkz.tostring.shein.SheinDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class ShopCluesDto {


    private String email;
    private String userName;
    private String userPassword;
    private String retypePassword;
    private String preferredLanguage;

    public String toString() {
        return "ShopCluesDto{\nEmail : " + email + "\nUser Name : " + userName +
                "\nUser Password : " + userPassword + "\nRe type Password : " +
                retypePassword + "\nPreferred Language : " + preferredLanguage + "}";
    }


    @Override
    public int hashCode() {
        return Objects.hash(email, userName, userPassword, retypePassword, preferredLanguage);
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

}


package com.xworkz.tostring.shopclues;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}


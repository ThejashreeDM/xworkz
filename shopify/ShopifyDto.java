package com.xworkz.tostring.shopify;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class ShopifyDto
{
    private String shopifyId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "ShopifyDto{\n" + "Id : " + shopifyId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ShopifyDto) {
            ShopifyDto child = (ShopifyDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(shopifyId, userName, email, password, confirmPassword, contactNumber);
    }
}

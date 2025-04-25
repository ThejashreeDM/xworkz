package com.xworkz.tostring.bigbasket;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class BigBasketDto
{
    private String bigbasketId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "BigBasketDto{\n" + "Id : " + bigbasketId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof BigBasketDto) {
            BigBasketDto bigBasket = (BigBasketDto) obj;
            if (this.bigbasketId == bigBasket.bigbasketId && this.userName == bigBasket.userName && this.email == bigBasket.email && this.password == bigBasket.password && this.confirmPassword == bigBasket.confirmPassword && this.contactNumber == bigBasket.contactNumber)
                return true;
        }
        return  false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bigbasketId, userName, email, password, confirmPassword, contactNumber);
    }
}

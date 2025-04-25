package com.xworkz.tostring.bestbuy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class BestBuyDto
{
    private String bestBuyId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "BestBuyDto{\n" + "Id : " + bestBuyId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }

    @Override
    public boolean equals(Object obj )
    {
        if(obj instanceof BestBuyDto)
        {
            BestBuyDto bestBuy=(BestBuyDto) obj;
            if(this.bestBuyId == bestBuy.bestBuyId && this.userName ==bestBuy.userName && this.email == bestBuy.email &&  this.password == bestBuy.password && this.confirmPassword == bestBuy.confirmPassword && this.contactNumber==bestBuy.contactNumber)
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bestBuyId, userName, email, password, confirmPassword, contactNumber);
    }
}

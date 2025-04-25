package com.xworkz.tostring.alibaba;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class AlibabaDto
{
    private String alibabaId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

//    @Override
//    public String toString() {
//        return "AlibabaDto{\n" + "Id : " + alibabaId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
//    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof AlibabaDto)
        {
            AlibabaDto alibaba=(AlibabaDto) obj;
            if(this.alibabaId == alibaba.alibabaId && this.userName == alibaba.userName && this.email == alibaba.email  && this.password == alibaba.password && this.confirmPassword == alibaba.confirmPassword && this.contactNumber ==alibaba.contactNumber)
                return true;

        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alibabaId, userName, email, password, confirmPassword, contactNumber);
    }
}

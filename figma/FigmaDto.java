package com.xworkz.tostring.figma;

import com.xworkz.tostring.esty.EtsyDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class FigmaDto
{
    private String figmaId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;


    @Override
    public String toString() {
        return "FigmaDto{\n" + "Id : " + figmaId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof FigmaDto) {
            FigmaDto child = (FigmaDto) obj;
            if (this.figmaId == child.figmaId && this.userName == child.userName && this.email == child.email && this.password == child.password && this.confirmPassword == child.confirmPassword && this.contactNumber == child.contactNumber)
                return true;
        }
        return  false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(figmaId, userName, email, password, confirmPassword, contactNumber);
    }
}

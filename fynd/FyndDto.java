package com.xworkz.tostring.fynd;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FyndDto
{
    private String fyndId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
  public String toString() {
      return "FyndDto{\n" + "Id : " + fyndId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
   }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof FyndDto)
        {
            FyndDto child=(FyndDto) obj;
            if(this.hashCode() == child.hashCode())
            {
                return true;
            }
        }
        return false;

    }
}

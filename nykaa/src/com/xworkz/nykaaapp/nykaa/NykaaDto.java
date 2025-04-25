package com.xworkz.nykaaapp.nykaa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class NykaaDto {
    private String emailId;
    private String name;
    private String mobileNumber;
    private String passWord;
    private String confirmPassWord;
   public String toString()
   {
       return "NykaaDto{\nEmailId : "+emailId+"\nName : "+name+"\nMobile Number : "+mobileNumber+"\nPassword : "+passWord+"\nConfirm Password : "+confirmPassWord+"}";
   }
    public boolean equals(Object obj) {
        if (obj instanceof NykaaDto) {
            NykaaDto child = (NykaaDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId, name, mobileNumber, passWord, confirmPassWord);
    }
}

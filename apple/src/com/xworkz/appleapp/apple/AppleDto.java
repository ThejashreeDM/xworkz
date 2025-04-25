package com.xworkz.appleapp.apple;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class AppleDto {
    private String appleId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;
  public String toString()
  {
      return "Apple{\nId : "+appleId+"\nUser Name : "+userName+"\nEmail : "+email+"\nPassword : "+password+"\nConfirm Password : "+confirmPassword+"\nContact Number : "+contactNumber+"}";
  }
    public boolean equals(Object obj) {
        if (obj instanceof AppleDto) {
            AppleDto child = (AppleDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(appleId, userName, email, password, confirmPassword, contactNumber);
    }
}



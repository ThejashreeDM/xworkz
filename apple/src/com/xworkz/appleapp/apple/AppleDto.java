package com.xworkz.appleapp.apple;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

}



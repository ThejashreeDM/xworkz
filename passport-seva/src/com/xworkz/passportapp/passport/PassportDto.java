package com.xworkz.passportapp.passport;
import com.xworkz.passportapp.constants.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PassportDto
{
    private CpvLocation cpvLocation;
    private Location dcdrLocation;
    private String givenName;
    private String surName;
    private String dob;
    private String email;
    private boolean isEmailLoginSame;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQues;
    private String hintAns;
    private String captcha;


    @Override
    public String toString() {
        return "PassPortDto{\nCpvLocation : " +cpvLocation +"\nLocation : " +dcdrLocation +"\nGiven Name : "+givenName +"\nSur Name : "+surName+"\nDOB : " +dob+"\nEmail : "+email +"\nIs Email Login Same : " +isEmailLoginSame +"\nLogin Id : "+loginId +"\nPassword : "+password +"\nConfirm Password : "+confirmPassword +"\nHint Question : "+hintQues +"\nHint Answer : "+hintAns +"\nCaptcha : "+captcha+"\n}";

    }



}

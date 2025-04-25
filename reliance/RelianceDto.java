package com.xworkz.tostring.reliance;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class RelianceDto {


    private String relianceId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    @Override
    public String toString() {
        return "RelianceDto{\n" + "Id : " + relianceId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RelianceDto) {
            RelianceDto child = (RelianceDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(relianceId, userName, email, password, confirmPassword, contactNumber);
    }
}




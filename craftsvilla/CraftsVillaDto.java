package com.xworkz.tostring.craftsvilla;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CraftsVillaDto
{

        private String craftsVillaId;
        private String userName;
        private String email;
        private String password;
        private String confirmPassword;
        private long contactNumber;

        @Override
        public String toString() {
            return "CraftsVillaDto{\n" + "Id : " + craftsVillaId + "\nUser Name : " + userName + "\nEmail : " + email + "\nPassword : " + password + "\nConfirm Password : " + confirmPassword + "\nContact Number : " + contactNumber + "}";
        }
}

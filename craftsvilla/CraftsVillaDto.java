package com.xworkz.tostring.craftsvilla;

import com.xworkz.tostring.bigbasket.BigBasketDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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

        @Override
        public boolean equals(Object obj)
        {
                if(obj instanceof CraftsVillaDto) {
                        CraftsVillaDto craftsVilla = (CraftsVillaDto) obj;
                        if (this.craftsVillaId == craftsVilla.craftsVillaId && this.userName == craftsVilla.userName && this.email == craftsVilla.email && this.password == craftsVilla.password && this.confirmPassword == craftsVilla.confirmPassword && this.contactNumber == craftsVilla.contactNumber)
                                return true;
                }
                return  false;
        }

        @Override
        public int hashCode() {
                return Objects.hash(craftsVillaId, userName, email, password, confirmPassword, contactNumber);
        }
}


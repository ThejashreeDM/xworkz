package com.xworkz.olafoods;
import com.xworkz.olafoods.userdata.OlaFoodsUserDto;
import com.xworkz.olafoods.signup.OlaFoods;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OlaFoodsRunner
{

        public static void main(String[] args) {
            OlaFoodsUserDto user1 = new OlaFoodsUserDto();
            user1.setEmail("foodlover@olafoods.com");
            user1.setPhoneNumber("9123456780");
            user1.setPassword("OlaEats@2024");
            user1.setFullName("Deepa M");
            user1.setDeliveryArea("Whitefield, Bangalore");

            OlaFoodsUserDto user2 = new OlaFoodsUserDto();
            user2.setEmail("foodlover@olafoods.com");
            user2.setPhoneNumber("9123456780");
            user2.setPassword("OlaEats@2024");
            user2.setFullName("Deepa M");
            user2.setDeliveryArea("Whitefield, Bangalore");

            OlaFoodsUserDto user3 = new OlaFoodsUserDto();
            user3.setEmail("theju@olafoods.com");
            user3.setPhoneNumber("9123456756");
            user3.setPassword("OlaEats@2024");
            user3.setFullName("Deepashree H");
            user3.setDeliveryArea("Rajajinagar, Bangalore");

            OlaFoods olaFoods = new OlaFoods();
            if (olaFoods.userSignUp(user1)) {
                System.out.println("OlaFoods Registration Successful!");
            } else {
                System.out.println("OlaFoods Registration Failed!");
            }
            System.out.println(user1);
            System.out.println(user1.equals(user2));
            System.out.println(user2.equals(user3));
        }
    }



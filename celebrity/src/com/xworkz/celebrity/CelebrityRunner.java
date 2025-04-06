package com.xworkz.celebrity;
import com.xworkz.celebrity.celebritymodule.Celebrity;
public class CelebrityRunner
{

        public static void display(Celebrity c) {
            System.out.println("Name           : " + c.getName());
            System.out.println("Age            : " + c.getAge());
            System.out.println("Profession     : " + c.getProfession());
            System.out.println("Nationality    : " + c.getNationality());
            System.out.println("Is Alive?      : " + c.getIsAlive());
            System.out.println("No. of Awards  : " + c.getNumberOfAwards());
            System.out.println("Famous Work    : " + c.getFamousWork());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Celebrity celeb1 = new Celebrity();
            celeb1.setName("Virat Kohli");
            celeb1.setAge(35);
            celeb1.setProfession("Cricketer");
            celeb1.setNationality("Indian");
            celeb1.setIsAlive(true);
            celeb1.setNumberOfAwards(50);
            celeb1.setFamousWork("Top Scorer in IPL");
            display(celeb1);

            Celebrity celeb2 = new Celebrity();
            celeb2.setName("Taylor Swift");
            celeb2.setAge(34);
            celeb2.setProfession("Singer");
            celeb2.setNationality("American");
            celeb2.setIsAlive(true);
            celeb2.setNumberOfAwards(500);
            celeb2.setFamousWork("1989 Album");
            display(celeb2);

            Celebrity celeb3 = new Celebrity();
            celeb3.setName("Bruce Lee");
            celeb3.setAge(32);
            celeb3.setProfession("Martial Artist / Actor");
            celeb3.setNationality("Chinese-American");
            celeb3.setIsAlive(false);
            celeb3.setNumberOfAwards(10);
            celeb3.setFamousWork("Enter the Dragon");
            display(celeb3);

            Celebrity celeb4 = new Celebrity();
            celeb4.setName("Amitabh Bachchan");
            celeb4.setAge(81);
            celeb4.setProfession("Actor");
            celeb4.setNationality("Indian");
            celeb4.setIsAlive(true);
            celeb4.setNumberOfAwards(200);
            celeb4.setFamousWork("Sholay");
            display(celeb4);

            Celebrity celeb5 = new Celebrity();
            celeb5.setName("Marie Curie");
            celeb5.setAge(66);
            celeb5.setProfession("Scientist");
            celeb5.setNationality("Polish-French");
            celeb5.setIsAlive(false);
            celeb5.setNumberOfAwards(2);
            celeb5.setFamousWork("Discovery of Radium");
            display(celeb5);
        }
    }



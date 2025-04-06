package com.xworkz.festivall;
import com.xworkz.festivall.festivalmodule.Festival;
public class FestivalRunner
{

        public static void display(Festival fest) {
            System.out.println("Festival Name     : " + fest.getName());
            System.out.println("Religion          : " + fest.getReligion());
            System.out.println("Country of Origin : " + fest.getCountryOfOrigin());
            System.out.println("Date/Month        : " + fest.getDateOrMonth());
            System.out.println("Public Holiday?   : " + fest.getIsPublicHoliday());
            System.out.println("Main Activities   : " + fest.getMainActivities());
            System.out.println("Duration (Days)   : " + fest.getDurationInDays());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Festival fest1 = new Festival();
            fest1.setName("Diwali");
            fest1.setReligion("Hinduism");
            fest1.setCountryOfOrigin("India");
            fest1.setDateOrMonth("October-November");
            fest1.setIsPublicHoliday(true);
            fest1.setMainActivities("Lighting lamps, fireworks, sweets");
            fest1.setDurationInDays(5);
            display(fest1);

            Festival fest2 = new Festival();
            fest2.setName("Christmas");
            fest2.setReligion("Christianity");
            fest2.setCountryOfOrigin("Bethlehem/Jerusalem");
            fest2.setDateOrMonth("December 25");
            fest2.setIsPublicHoliday(true);
            fest2.setMainActivities("Tree decoration, gifts, prayers");
            fest2.setDurationInDays(1);
            display(fest2);

            Festival fest3 = new Festival();
            fest3.setName("Eid al-Fitr");
            fest3.setReligion("Islam");
            fest3.setCountryOfOrigin("Arabian Peninsula");
            fest3.setDateOrMonth("After Ramadan");
            fest3.setIsPublicHoliday(true);
            fest3.setMainActivities("Prayers, feasting, charity");
            fest3.setDurationInDays(1);
            display(fest3);

            Festival fest4 = new Festival();
            fest4.setName("Vesak");
            fest4.setReligion("Buddhism");
            fest4.setCountryOfOrigin("India/Nepal");
            fest4.setDateOrMonth("April-May");
            fest4.setIsPublicHoliday(true);
            fest4.setMainActivities("Meditation, rituals, offerings");
            fest4.setDurationInDays(1);
            display(fest4);

            Festival fest5 = new Festival();
            fest5.setName("Thanksgiving");
            fest5.setReligion("Cultural/Christian roots");
            fest5.setCountryOfOrigin("United States");
            fest5.setDateOrMonth("Fourth Thursday of November");
            fest5.setIsPublicHoliday(true);
            fest5.setMainActivities("Family dinner, gratitude, parades");
            fest5.setDurationInDays(1);
            display(fest5);
        }
    }

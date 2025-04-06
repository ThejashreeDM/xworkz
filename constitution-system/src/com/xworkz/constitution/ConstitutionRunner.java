package com.xworkz.constitution;
import com.xworkz.constitution.constitutionmodule.Constitution;
public class ConstitutionRunner
{

        public static void display(Constitution c) {
            System.out.println("Country             : " + c.getCountry());
            System.out.println("Constitution Name   : " + c.getConstitutionName());
            System.out.println("Adopted Date        : " + c.getAdoptedDate());
            System.out.println("Drafted By          : " + c.getDraftedBy());
            System.out.println("Total Articles      : " + c.getTotalArticles());
            System.out.println("Is Written?         : " + c.getIsWritten());
            System.out.println("Official Language   : " + c.getLanguage());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Constitution india = new Constitution();
            india.setCountry("India");
            india.setConstitutionName("Constitution of India");
            india.setAdoptedDate("26 January 1950");
            india.setDraftedBy("Dr. B.R. Ambedkar");
            india.setTotalArticles(448);
            india.setIsWritten(true);
            india.setLanguage("Hindi & English");
            display(india);

            Constitution usa = new Constitution();
            usa.setCountry("United States of America");
            usa.setConstitutionName("Constitution of the United States");
            usa.setAdoptedDate("17 September 1787");
            usa.setDraftedBy("James Madison and others");
            usa.setTotalArticles(7);
            usa.setIsWritten(true);
            usa.setLanguage("English");
            display(usa);

            Constitution uk = new Constitution();
            uk.setCountry("United Kingdom");
            uk.setConstitutionName("Unwritten Constitution (Acts, Conventions, etc.)");
            uk.setAdoptedDate("Evolved over time");
            uk.setDraftedBy("Multiple Sources");
            uk.setTotalArticles(0); // Not applicable
            uk.setIsWritten(false);
            uk.setLanguage("English");
            display(uk);

            Constitution japan = new Constitution();
            japan.setCountry("Japan");
            japan.setConstitutionName("Constitution of Japan");
            japan.setAdoptedDate("3 May 1947");
            japan.setDraftedBy("MacArthur and Japanese government");
            japan.setTotalArticles(103);
            japan.setIsWritten(true);
            japan.setLanguage("Japanese");
            display(japan);

            Constitution southAfrica = new Constitution();
            southAfrica.setCountry("South Africa");
            southAfrica.setConstitutionName("Constitution of South Africa");
            southAfrica.setAdoptedDate("4 February 1997");
            southAfrica.setDraftedBy("Constitutional Assembly");
            southAfrica.setTotalArticles(14);
            southAfrica.setIsWritten(true);
            southAfrica.setLanguage("11 official languages");
            display(southAfrica);
        }
    }



package com.xworkz.wikipediaapp;

import com.xworkz.wikipediaapp.wikipedia.WikiPediaDto;
import com.xworkz.wikipediaapp.login.WikipediaLogIn;

public class WikiPediaRunner {


        public static void main(String[] args) {

            WikiPediaDto wikiUser = new WikiPediaDto();
            wikiUser.setEmail("wiki.user@example.com");
            wikiUser.setUserName("wikiHarshi123");
            wikiUser.setUserPassword("Harshi@123");
            wikiUser.setRetypePassword("Harshi@123");
            wikiUser.setPreferredLanguage("English");

            WikiPediaDto wikiUser1 = new WikiPediaDto();
            wikiUser1.setEmail("wiki.user@example.com");
            wikiUser1.setUserName("wikiHarshi123");
            wikiUser1.setUserPassword("Harshi@123");
            wikiUser1.setRetypePassword("Harshi@123");
            wikiUser1.setPreferredLanguage("English");

            WikiPediaDto wikiUser2 = new WikiPediaDto();
            wikiUser2.setEmail("user@example.com");
            wikiUser2.setUserName("theju");
            wikiUser2.setUserPassword("Theju@123");
            wikiUser2.setRetypePassword("Theju@123");
            wikiUser2.setPreferredLanguage("English");

            WikipediaLogIn login = new WikipediaLogIn();
            boolean loginResult = login.processLogin(wikiUser);

            System.out.println(wikiUser);
            System.out.println(wikiUser.equals(wikiUser1));
            System.out.println(wikiUser1.equals(wikiUser2));

        }
    }



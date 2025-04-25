package com.xworkz.youtubeapp;
import com.xworkz.youtubeapp.youtube.YouTubeDto;
import com.xworkz.youtubeapp.loginuser.YouTubeLogIn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class YouTubeRunner {


        public static void main(String[] args) {

            YouTubeDto user = new YouTubeDto();
            user.setUserEmail("theju11304@gmail.com");
            user.setChannelName("Jenny's Lecture");
            user.setPassword("Theju@04");
            user.setConfirmPassword("Theju@04");
            user.setMobile(1234567890);

            YouTubeDto user1 = new YouTubeDto();
            user1.setUserEmail("theju11304@gmail.com");
            user1.setChannelName("Jenny's Lecture");
            user1.setPassword("Theju@04");
            user1.setConfirmPassword("Theju@04");
            user1.setMobile(1234567890);

            YouTubeDto user2 = new YouTubeDto();
            user2.setUserEmail("theju11304@gmail.com");
            user2.setChannelName("Durga Software Solutions");
            user2.setPassword("Theju@04");
            user2.setConfirmPassword("Theju@04");
            user2.setMobile(1234567890);

            YouTubeLogIn login = new YouTubeLogIn();
            boolean result = login.startSignIn(user);
            System.out.println(user);
            System.out.println(user.equals(user1));
            System.out.println(user1.equals(user2));
        }
    }



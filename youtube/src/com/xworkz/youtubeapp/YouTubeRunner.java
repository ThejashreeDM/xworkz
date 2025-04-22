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

            YouTubeLogIn login = new YouTubeLogIn();
            boolean result = login.startSignIn(user);
            System.out.println(user);
        }
    }



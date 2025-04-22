package com.xworkz.youtubeapp.youtube;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class YouTubeDto {


        private String userEmail;
        private String channelName;
        private String password;
        private String confirmPassword;
        private long mobile;

        public String toString()
        {
                return "YouTubeDto{\nUser Name : "+userEmail+"\n ChannelName : "+channelName+"\nPassword : "+password+"\n Confirm Password : "+confirmPassword +"\n Mobile Confirm : "+mobile;
        }

    }



package com.xworkz.youtubeapp.youtube;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

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

        public boolean equals(Object obj) {
                if (obj instanceof YouTubeDto) {
                        YouTubeDto child = (YouTubeDto) obj;
                        if (this.hashCode() == child.hashCode()) {
                                return true;
                        }
                }
                return false;

        }

        @Override
        public int hashCode() {
                return Objects.hash(userEmail, channelName, password, confirmPassword, mobile);
        }
}



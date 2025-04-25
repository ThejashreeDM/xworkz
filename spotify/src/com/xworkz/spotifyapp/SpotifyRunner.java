package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.spotify.SpotifyDto;
import com.xworkz.spotifyapp.login.SpotifyLogIn;

public class SpotifyRunner {

    public static void main(String[] args) {

        SpotifyDto dto = new SpotifyDto();
        dto.setArtistName("DJ Melody");
        dto.setEmail("melody@beatmail.com");
        dto.setTrackKey("beat123456");
        dto.setReEnterKey("beat123456");
        dto.setPlaylistId(1234567890L);
        dto.setRegion("USA");

        SpotifyDto dto1 = new SpotifyDto();
        dto1.setArtistName("DJ Melody");
        dto1.setEmail("melody@beatmail.com");
        dto1.setTrackKey("beat123456");
        dto1.setReEnterKey("beat123456");
        dto1.setPlaylistId(1234567890L);
        dto1.setRegion("USA");

        SpotifyDto dto2 = new SpotifyDto();
        dto2.setArtistName("Pruthvi");
        dto2.setEmail("melody@beatmail.com");
        dto2.setTrackKey("beat1234");
        dto2.setReEnterKey("beat1234");
        dto2.setPlaylistId(8734567890L);
        dto2.setRegion("Karnataka");

        SpotifyLogIn login = new SpotifyLogIn();
        boolean result = login.tuneIn(dto);
        System.out.println("Final login result: " + result);

        System.out.println(dto);
        System.out.println(dto.equals(dto1));
        System.out.println(dto1.equals(dto2));
    }
}

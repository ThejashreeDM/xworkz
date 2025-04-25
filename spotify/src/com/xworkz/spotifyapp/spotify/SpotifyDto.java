package com.xworkz.spotifyapp.spotify;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class SpotifyDto {

    private String artistName;
    private String email;
    private String trackKey;
    private String reEnterKey;
    private long playlistId;
    private String region;

    @Override
    public String toString() {
        return "SpotifyDto{\nArtist Name : "+artistName+"\nEmail : "+email+"\nTrack Key : "+trackKey+"\nRe Enter Key : "+reEnterKey+"\nPlay List Id : "+playlistId+"\nRegion : "+region+"}";
    }
    public boolean equals(Object obj) {
        if (obj instanceof SpotifyDto) {
            SpotifyDto child = (SpotifyDto) obj;
            if (this.hashCode() == child.hashCode()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(artistName, email, trackKey, reEnterKey, playlistId, region);
    }
}

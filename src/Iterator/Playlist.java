package Iterator;

import java.util.List;

// Aggregate class - holds collection of songs to be iterated
public class Playlist {
    List<String> songs;

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}

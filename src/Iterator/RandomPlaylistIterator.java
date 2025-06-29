package Iterator;

import java.util.Collections;
import java.util.Random;

// Concrete iterator - returns random songs from playlist (with possible repeats)
public class RandomPlaylistIterator implements PlayListIterator{
    private Playlist playlist;
    private int index; // Track how many songs returned
    private Random rc; // Random number generator

    RandomPlaylistIterator(Playlist playlist){
        this.playlist= playlist;
        index=0;
        rc=new Random();
    }

    @Override
    public boolean hasNext() {
        return index < playlist.songs.size();
    }

    @Override
    public String next() {
        index++;
        return playlist.getSongs().get(rc.nextInt(playlist.getSongs().size()));
    }
}

package Iterator;

import java.util.ArrayList;
import java.util.Collections;

// Concrete iterator - traverses playlist in shuffled order (no repeats)
public class ShufflePlaylistIterator implements PlayListIterator{
    private Playlist playlist;
    private int index;
    private ArrayList<String> shuffledSongs; // Pre-shuffled copy of songs

    public ShufflePlaylistIterator(Playlist playlist){
        this.playlist= playlist;
        this.shuffledSongs= new ArrayList<>(playlist.getSongs());
        Collections.shuffle(shuffledSongs); // Shuffle once at creation
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < shuffledSongs.size();
    }

    @Override
    public String next() {
        return shuffledSongs.get(index++);
    }
}

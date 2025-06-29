package Iterator;

// Concrete iterator - traverses playlist in sequential order
public class SimplePlaylistIterator implements PlayListIterator{
    private Playlist playlist;
    private int index; // Current position in the playlist

    SimplePlaylistIterator(Playlist playlist){
        this.playlist= playlist;
        this.index= 0;
    }

    @Override
    public boolean hasNext() {
        return index < playlist.songs.size();
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}

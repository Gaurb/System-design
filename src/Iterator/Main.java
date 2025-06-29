package Iterator;

import java.util.ArrayList;
import java.util.List;

// Demonstrates Iterator pattern - different ways to traverse same playlist
public class Main {
    public static void main(String[] args) {

        // Create playlist with sample songs
        Playlist playlist= new Playlist();
        List<String> songs = new ArrayList<>();

        songs.add("Tare Zaameen Par");
        songs.add("Shaky Shaky");
        songs.add("Hai Junoon");
        songs.add("Despacito");
        songs.add("Mere Vatan");
        playlist.setSongs(songs);

        // Sequential iteration
        System.out.println("Simple Song Iterator");
        PlayListIterator iterator = new SimplePlaylistIterator(playlist);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Shuffled iteration (no repeats)
        System.out.println("\nShuffle Song Iterator");
        iterator = new ShufflePlaylistIterator(playlist);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Random iteration (possible repeats)
        System.out.println("Random Song Iterator");
        iterator = new RandomPlaylistIterator(playlist);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

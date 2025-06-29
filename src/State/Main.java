package State;

// Demonstrates State pattern - media player behavior changes based on current state
public class Main {
    public static void main(String[] args) {
        // Create media player (starts in Stopped state)
        MediaPlayer player = new MediaPlayer();
        
        System.out.println("=== Media Player State Pattern Demo ===\n");
        
        // Load a song
        player.loadSong("Bohemian Rhapsody - Queen");
        
        System.out.println("\n=== Testing operations from Stopped state ===");
        player.stop();  // Already stopped
        player.pause(); // Cannot pause when stopped
        player.play();  // Start playing
        
        System.out.println("\n=== Testing operations from Playing state ===");
        player.play();  // Already playing
        player.pause(); // Pause the music
        
        System.out.println("\n=== Testing operations from Paused state ===");
        player.pause(); // Already paused
        player.play();  // Resume playing
        player.stop();  // Stop from playing
        
        System.out.println("\n=== Loading new song and testing ===");
        player.loadSong("Imagine - John Lennon");
        player.play();  // Start new song
        player.pause(); // Pause it
        player.stop();  // Stop it
        
        System.out.println("\n=== Final state transitions ===");
        player.play();  // Play again
        player.stop();  // Stop
        player.play();  // Play from stopped
        player.pause(); // Pause
        player.pause(); // Try to pause again
        player.stop();  // Stop from paused
    }
} 
package State;

// Context class - maintains current state and delegates operations to it
public class MediaPlayer {
    private State currentState;
    private String currentSong;

    public MediaPlayer() {
        // Initialize with stopped state
        this.currentState = new StoppedState();
        this.currentSong = "No song loaded";
    }

    // Delegate play operation to current state
    public void play() {
        currentState.play(this);
    }

    // Delegate pause operation to current state
    public void pause() {
        currentState.pause(this);
    }

    // Delegate stop operation to current state
    public void stop() {
        currentState.stop(this);
    }

    // State transition method
    public void setState(State state) {
        this.currentState = state;
        System.out.println("State changed to: " + state.getClass().getSimpleName());
    }

    // Load a new song
    public void loadSong(String song) {
        this.currentSong = song;
        System.out.println("Loaded song: " + song);
    }

    public String getCurrentSong() {
        return currentSong;
    }

    public State getCurrentState() {
        return currentState;
    }
} 
package State;

// State interface - defines methods that each state must implement
public interface State {
    void play(MediaPlayer player);
    void pause(MediaPlayer player);
    void stop(MediaPlayer player);
} 
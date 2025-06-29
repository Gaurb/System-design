package State;

// Concrete State - handles behavior when player is stopped
public class StoppedState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Starting playback from beginning: " + player.getCurrentSong());
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Cannot pause - player is already stopped");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Player is already stopped");
    }
} 
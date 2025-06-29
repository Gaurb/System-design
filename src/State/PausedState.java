package State;

// Concrete State - handles behavior when player is paused
public class PausedState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming playback: " + player.getCurrentSong());
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused: " + player.getCurrentSong());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopping from pause: " + player.getCurrentSong());
        player.setState(new StoppedState());
    }
} 
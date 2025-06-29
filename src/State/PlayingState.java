package State;

// Concrete State - handles behavior when player is playing
public class PlayingState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing: " + player.getCurrentSong());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Pausing playback: " + player.getCurrentSong());
        player.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopping playback: " + player.getCurrentSong());
        player.setState(new StoppedState());
    }
} 
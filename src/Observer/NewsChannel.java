package Observer;

// Concrete Observer - TV news channel that displays breaking news
public class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    // Receive news update and broadcast on TV
    @Override
    public void update(String news) {
        System.out.println("[TV] " + channelName + " broadcasts: " + news);
    }
} 
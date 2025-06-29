package Observer;

// Concrete Observer - mobile app that sends push notifications
public class MobileNewsApp implements Observer {
    private String appName;

    public MobileNewsApp(String appName) {
        this.appName = appName;
    }

    // Receive news update and send push notification
    @Override
    public void update(String news) {
        System.out.println("[MOBILE] " + appName + " sends push notification: " + news);
    }
} 
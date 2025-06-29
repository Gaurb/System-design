package Observer;

// Demonstrates Observer pattern - news agency notifying multiple subscribers
public class Main {
    public static void main(String[] args) {
        // Create news agency (Subject)
        NewsAgency newsAgency = new NewsAgency();

        // Create different types of news subscribers (Observers)
        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel bbc = new NewsChannel("BBC");
        NewsBlog techBlog = new NewsBlog("TechCrunch");
        MobileNewsApp newsApp = new MobileNewsApp("NewsNow");

        // Subscribe observers to news agency
        System.out.println("=== Adding Subscribers ===");
        newsAgency.addObserver(cnn);
        newsAgency.addObserver(bbc);
        newsAgency.addObserver(techBlog);
        newsAgency.addObserver(newsApp);

        // Publish news - all subscribers get notified automatically
        System.out.println("\n=== Publishing News ===");
        newsAgency.publishNews("Major earthquake hits Japan!");

        newsAgency.publishNews("New AI breakthrough announced!");

        // Remove a subscriber and publish again
        System.out.println("\n=== Removing Subscriber ===");
        newsAgency.removeObserver(bbc);

        System.out.println("\n=== Publishing After Removal ===");
        newsAgency.publishNews("Stock market reaches all-time high!");

        // Add new subscriber
        System.out.println("\n=== Adding New Subscriber ===");
        MobileNewsApp sportApp = new MobileNewsApp("SportsTimes");
        newsAgency.addObserver(sportApp);

        newsAgency.publishNews("World Cup final results announced!");
    }
} 
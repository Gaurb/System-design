package Observer;

// Concrete Observer - online blog that publishes news articles
public class NewsBlog implements Observer {
    private String blogName;

    public NewsBlog(String blogName) {
        this.blogName = blogName;
    }

    // Receive news update and publish blog article
    @Override
    public void update(String news) {
        System.out.println("[BLOG] " + blogName + " publishes article: " + news);
    }
} 
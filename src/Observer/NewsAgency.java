package Observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject - manages news updates and notifies all subscribers
public class NewsAgency implements Subject {
    private List<Observer> observers;
    private String latestNews;

    public NewsAgency() {
        this.observers = new ArrayList<>();
    }

    // Add subscriber to notification list
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer added: " + observer.getClass().getSimpleName());
    }

    // Remove subscriber from notification list
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed: " + observer.getClass().getSimpleName());
    }

    // Notify all subscribers about news update
    @Override
    public void notifyObservers() {
        System.out.println("\nNotifying all observers about: " + latestNews);
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    // Publish new news and automatically notify subscribers
    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\nNews Agency: Breaking News - " + news);
        notifyObservers();
    }

    public String getLatestNews() {
        return latestNews;
    }
} 
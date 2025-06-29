package Observer;

// Subject interface - defines methods for managing and notifying observers
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
} 
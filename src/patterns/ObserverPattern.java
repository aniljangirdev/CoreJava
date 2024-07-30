package patterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {

        Feeds feeds = new Feeds();

        feeds.register((tweet) -> {
            if (tweet != null && tweet.contains("something")) {
                System.out.println("Great tweeter");
            }
        });

        feeds.register((tweet) -> {
            if (tweet != null && tweet.contains("queen")) {
                System.out.println("Yet more news from London time!");
            }
        });
        feeds.notifyObserver("money dsd something queen");
    }
}

class Feeds implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer b) {
        observers.add(b);
    }

    @Override
    public void notifyObserver(String tweet) {
        observers.forEach(o -> o.notify(tweet));
    }
}

interface Subject {
    void register(Observer b);
    void notifyObserver(String tweet);

}

interface Observer {
    void notify(String tweet);
}
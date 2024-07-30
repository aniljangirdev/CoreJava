package pack5;

import java.util.ArrayList;
import java.util.List;

public class ObeserverPattern {

    public static void main(String[] args) {


        Observer observer1 = message -> System.out.println("recived from O1" + message);

        Observer observer2 = message -> System.out.println("recived from O2" + message);

        Subject subject = new Subject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.setMessage("sample Observer");
        subject.setMessage("sample Observer1");
    }
}

interface Observer {
    void update(String message);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(message);
        }
    }


    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

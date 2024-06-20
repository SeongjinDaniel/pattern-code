package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    Object getUpdate(Observer observer);
}

interface Observer {
    void update();
}

class Topic implements Subject {
    private List<Observer> observers;
    private String message;

    public Topic() {
        this.observers = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to topic: " + message);
        this.message = message;
        notifyObservers();
    }
}

class TopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public TopicSubscriber(String name, Subject topic) {
        this.name = name;
        this.topic = topic;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        System.out.println(name + ":: got message >> " + message);
    }
}

public class ObserverMain {
    public static void main(String[] args) {
        Topic topic = new Topic();

        Observer observer1 = new TopicSubscriber("Observer 1", topic);
        Observer observer2 = new TopicSubscriber("Observer 2", topic);
        Observer observer3 = new TopicSubscriber("Observer 3", topic);

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        topic.postMessage("amumu is op champion!!");
    }
}
/*
Message posted to topic: amumu is op champion!!
Observer 1:: got message >> amumu is op champion!!
Observer 2:: got message >> amumu is op champion!!
Observer 3:: got message >> amumu is op champion!!
 */
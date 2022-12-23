package com.example.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TimeServer {
    private final Timer timer;
    private int timeState;


    public TimeServer() {

        this.timer = new Timer(true);
        TimerTask task = new TimerTask() {
            public void run() {
                tick();
            }
        };

        timer.schedule(task, 5,500);
    }

    public int getTimeState() {
        return timeState;
    }

    private void tick(){
        timeState++;
        notifyAllObservers();
    }
    private List<IObserver> observers = new ArrayList<IObserver>();
    public void attach(IObserver observer){

        observers.add(observer);
    }
    public void detach(IObserver observer){

        observers.remove(observer);

    }

    public void notifyAllObservers(){

        for (IObserver observer : observers) {
            observer.update();

        }

    }


}

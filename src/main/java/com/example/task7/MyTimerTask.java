package com.example.task7;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    int count = 0;

    @Override
    public void run() {
        count = count + 1;
        System.out.println("Число равно:" + count);

    }



        public static void main(String args[]){
        TimerTask timerTask = new MyTimerTask();
        // стартуем TimerTask в виде демона

        Timer timer = new Timer(true);
        // будем запускать каждых 10 секунд (10 * 1000 миллисекунд)
        timer.scheduleAtFixedRate(timerTask, 0, 10*100);
        System.out.print:ln("Счетчик начал свое выполение");

        // вызываем cancel() через какое-то время
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        }
    }


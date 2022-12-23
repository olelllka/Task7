package com.example.task7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Timer;
import java.util.TimerTask;

public class HelloController {
    @FXML
    private Label welcomeText;
    TimeServer timeServer;
    Signal signal ;
    @FXML
    protected void onHelloButtonClick() {

     timeServer.attach(signal);


           /* count = count + 1;
            welcomeText.setText("" + count);

                TimerTask timerTask = new MyTimerTask();
                // стартуем TimerTask в виде демона

                Timer timer = new Timer(true);
                // будем запускать каждых 10 секунд (10 * 1000 миллисекунд)
                timer.scheduleAtFixedRate(timerTask, 0, 10*100);
                System.out.println("Счетчик начал свое выполение");
                // вызываем cancel() через какое-то время
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                timer.cancel();
            }*/
        }

    public void onStart(ActionEvent actionEvent) {
        timeServer = new TimeServer();
        signal = new Signal(welcomeText);
    }
}


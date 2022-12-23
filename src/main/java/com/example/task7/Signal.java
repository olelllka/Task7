package com.example.task7;

import javafx.scene.control.Label;

public class Signal  implements IObserver{
    int count = 0;
    Label welc;

    @Override
    public void update() {
        welc.setText(""+count);
        count++;
    }

    public Signal(Label welc) {
        this.welc = welc;
    }
}

package View;

import java.awt.EventQueue;

import Controlador.LogicaP;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Racetrack frame = new Racetrack();
                    LogicaP logic = new LogicaP(frame);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}


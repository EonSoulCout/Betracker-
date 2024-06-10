package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import View.Racetrack;
import View.FieldsStart;
import View.Bet;

public class LogicaP implements ActionListener {

    Racetrack m;
    FieldsStart fieldsStart;
    Bet bet;

    public LogicaP(Racetrack m) {
        super();
        this.m = m;
        this.m.btn_Bet.addActionListener(this);
        this.m.btn_Start.addActionListener(this);
        this.m.btn_Pause.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == m.btn_Bet) {
            // Obtener los nombres de los jugadores desde Racetrack
            String name1 = m.lbl_Time1.getText();
            String name2 = m.lbl_Time2.getText();
            String name3 = m.lbl_Time3.getText();

            // Crear la ventana de apuestas y mostrarla
            bet = new Bet();
            bet.setVisible(true);
            
            // Establecer los nombres en las etiquetas de la ventana de apuestas
            bet.lbl_NameP1.setText(name1);
            bet.lbl_NameP2.setText(name2);
            bet.lbl_NameP3.setText(name3);
        }

        if (e.getSource() == m.btn_Start) {
            fieldsStart = new FieldsStart(m);
            fieldsStart.setVisible(true);
        }

        if (e.getSource() == m.btn_Pause) {
            JOptionPane.showMessageDialog(m, "Juego pausado");
        }
    }
}

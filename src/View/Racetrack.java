package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import Model.Player;

public class Racetrack extends JFrame {

    private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public JPanel pn_Principal;
    public JButton btn_Bet;
    public JButton btn_Start;
    public JButton btn_Pause;
    public JLabel lbl_Time1;
    public JLabel lbl_Time2;
    public JLabel lbl_Time3;
    public JLabel lbl_Player1;
    public JLabel lbl_Player2;
    public JLabel lbl_Player3;
    public Player player1, player2, player3;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Racetrack frame = new Racetrack();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Racetrack() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 799, 893);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        pn_Principal = new JPanel();
        pn_Principal.setBackground(new Color(192, 192, 192));
        pn_Principal.setBounds(10, 11, 758, 49);
        contentPane.add(pn_Principal);
        pn_Principal.setLayout(null);

        btn_Bet = new JButton("Apostar");
        btn_Bet.setToolTipText("Apostar a un jugador");
        btn_Bet.setBounds(10, 11, 120, 30);
        pn_Principal.add(btn_Bet);

        btn_Start = new JButton("Empezar");
        btn_Start.setToolTipText("Empezar carrera");
        btn_Start.setBounds(140, 11, 120, 30);
        pn_Principal.add(btn_Start);

        btn_Pause = new JButton("Pausar");
        btn_Pause.setToolTipText("Pausar carrera");
        btn_Pause.setBounds(270, 11, 120, 30);
        pn_Principal.add(btn_Pause);

        lbl_Player1 = new JLabel("Player 1:");
        lbl_Player1.setBounds(400, 11, 60, 14);
        pn_Principal.add(lbl_Player1);

        lbl_Time1 = new JLabel("Autotime");
        lbl_Time1.setBounds(460, 11, 60, 14);
        pn_Principal.add(lbl_Time1);

        lbl_Player2 = new JLabel("Player 2:");
        lbl_Player2.setBounds(520, 27, 60, 14);
        pn_Principal.add(lbl_Player2);

        lbl_Time2 = new JLabel("Autotime");
        lbl_Time2.setBounds(580, 27, 60, 14);
        pn_Principal.add(lbl_Time2);

        lbl_Player3 = new JLabel("Player 3:");
        lbl_Player3.setBounds(642, 11, 60, 14);
        pn_Principal.add(lbl_Player3);

        lbl_Time3 = new JLabel("Autotime");
        lbl_Time3.setBounds(702, 11, 60, 14);
        pn_Principal.add(lbl_Time3);

        Track pn_liezo = new Track();
        pn_liezo.setBounds(10, 70, 760, 770);
        contentPane.add(pn_liezo);

        btn_Start.addActionListener(e -> {
            FieldsStart fieldsStart = new FieldsStart(this);
            fieldsStart.setVisible(true);
        });
    }

    public void setPlayers(Player player1, Player player2, Player player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;

        lbl_Player1.setText("Player 1: " + player1.getName());
        lbl_Time1.setText("Time: " + player1.getExecutionTime());
        lbl_Player2.setText("Player 2: " + player2.getName());
        lbl_Time2.setText("Time: " + player2.getExecutionTime());
        lbl_Player3.setText("Player 3: " + player3.getName());
        lbl_Time3.setText("Time: " + player3.getExecutionTime());
    }
}

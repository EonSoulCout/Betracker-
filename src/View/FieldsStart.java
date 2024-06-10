package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Model.Player;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FieldsStart extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txt_Name1;
    private JTextField txt_Name2;
    private JTextField txt_Name3;
    private JButton btn_Start;
    private JButton btn_Cancel;
    private Racetrack racetrack;

    public FieldsStart(Racetrack racetrack) {
        this.racetrack = racetrack;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 228, 207);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Player 1:");
        lblNewLabel.setBounds(10, 11, 98, 31);
        contentPane.add(lblNewLabel);

        JLabel lblPlayer = new JLabel("Player 2:");
        lblPlayer.setBounds(10, 53, 98, 31);
        contentPane.add(lblPlayer);

        JLabel lblPlayer_1 = new JLabel("Player 3:");
        lblPlayer_1.setBounds(10, 95, 98, 31);
        contentPane.add(lblPlayer_1);

        txt_Name1 = new JTextField();
        txt_Name1.setBounds(118, 16, 86, 20);
        contentPane.add(txt_Name1);
        txt_Name1.setColumns(10);

        txt_Name2 = new JTextField();
        txt_Name2.setColumns(10);
        txt_Name2.setBounds(118, 58, 86, 20);
        contentPane.add(txt_Name2);

        txt_Name3 = new JTextField();
        txt_Name3.setColumns(10);
        txt_Name3.setBounds(118, 100, 86, 20);
        contentPane.add(txt_Name3);

        btn_Cancel = new JButton("Cancelar");
        btn_Cancel.setBounds(10, 137, 89, 23);
        contentPane.add(btn_Cancel);
        btn_Cancel.addActionListener(e -> dispose());

        btn_Start = new JButton("Empezar");
        btn_Start.setBounds(115, 137, 89, 23);
        contentPane.add(btn_Start);

        btn_Start.addActionListener(e -> {
            String name1 = txt_Name1.getText();
            String name2 = txt_Name2.getText();
            String name3 = txt_Name3.getText();
            racetrack.setPlayers(new Player(name1), new Player(name2), new Player(name3));
            dispose();
        });
    }
}

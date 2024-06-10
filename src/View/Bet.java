package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class Bet extends JFrame {

    private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public JLabel lbl_NameP3;
    public JLabel lbl_NameP2;
    public JLabel lbl_NameP1;

    /**
     * Create the frame.
     */
    public Bet() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 228, 204);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btn_Cancel = new JButton("Cancelar");
        btn_Cancel.setBounds(10, 137, 89, 23);
        contentPane.add(btn_Cancel);
        
        JButton btn_Start = new JButton("Empezar");
        btn_Start.setBounds(115, 137, 89, 23);
        contentPane.add(btn_Start);
        
        lbl_NameP3 = new JLabel("Player3");
        lbl_NameP3.setBounds(10, 95, 98, 31);
        contentPane.add(lbl_NameP3);
        
        lbl_NameP2 = new JLabel("Player2");
        lbl_NameP2.setBounds(10, 53, 98, 31);
        contentPane.add(lbl_NameP2);
        
        lbl_NameP1 = new JLabel("Player1");
        lbl_NameP1.setBounds(10, 11, 98, 31);
        contentPane.add(lbl_NameP1);
        
        JSpinner spn_Bet3 = new JSpinner();
        spn_Bet3.setBounds(115, 99, 45, 23);
        contentPane.add(spn_Bet3);
        
        JSpinner spn_Bet2 = new JSpinner();
        spn_Bet2.setBounds(115, 57, 45, 23);
        contentPane.add(spn_Bet2);
        
        JSpinner spn_Bet1 = new JSpinner();
        spn_Bet1.setBounds(115, 15, 45, 23);
        contentPane.add(spn_Bet1);
    }
}

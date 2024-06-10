package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Track extends JPanel {

	private static final long serialVersionUID = 1L;
	private Image imagen;
	private Image imagen2;
	private Image imagen3;
	private Image imagen4;


	
	public Track() {
		setBackground(new Color(122, 166, 78));
		repaint();

		imagen = Toolkit.getDefaultToolkit().getImage("src/View/Images/PistaV2.jpg");
	    imagen = imagen.getScaledInstance(190, 300, Image.SCALE_SMOOTH);
	    
	    imagen2 = Toolkit.getDefaultToolkit().getImage("src/View/Images/BlueCar.png");
	    imagen2 = imagen2.getScaledInstance(190, 300, Image.SCALE_SMOOTH);
	    
	    imagen3 = Toolkit.getDefaultToolkit().getImage("src/View/Images/WhiteCar.png");
	    imagen3 = imagen3.getScaledInstance(190, 300, Image.SCALE_SMOOTH);
	    
	    imagen4 = Toolkit.getDefaultToolkit().getImage("src/View/Images/RedCar.png");
	    imagen4 = imagen4.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(imagen, 60, 0, 150, 780, this);
		g.drawImage(imagen, 300, 0, 150, 780, this);
		g.drawImage(imagen, 540, 0, 150, 780, this);
		g.drawImage(imagen4, 580, 705, 70, 80, this);
		g.drawImage(imagen3, 340, 705, 70, 80, this);
		g.drawImage(imagen2, 100, 700, 70, 85, this);
		
	}

}

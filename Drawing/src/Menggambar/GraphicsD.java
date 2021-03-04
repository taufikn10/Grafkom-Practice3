package Menggambar;

import java.awt.*;
import javax.swing.*;

public class GraphicsD extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		Graphics2D g2D = (Graphics2D) g;
		

//		Badan Oval blue
		g2D.setPaint(new Color(3,107,183));
		g2D.fillOval(150,150,250,250);
		
//		Kaki garis kanan blue
		g2D.setPaint(new Color(3,107,183));
		g2D.setStroke(new BasicStroke(20));
		g2D.drawLine(330, 250, 330, 480);

//		Kaki garis kiri blue
		g2D.setPaint(new Color(3,107,183));
		g2D.setStroke(new BasicStroke(20));
		g2D.drawLine(220, 250, 220, 480);
		
//		garis kepala white
		g2D.setColor(Color.WHITE);
		g2D.setStroke(new BasicStroke(10));
		g2D.drawOval(225, 100, 110, 200);
		 
//		kepala blue
		g2D.setPaint(new Color(3,107,183));
		g2D.fillOval(225, 100, 110, 200);
		
//		Mata Luar white
		g2D.setColor(Color.WHITE);
		g2D.fillOval(250, 170, 25, 40);
		
//		Mata Luar2 white
		g2D.setColor(Color.WHITE);
		g2D.fillOval(285, 170, 25, 40);
		
//		Mata Dalam brown
		g2D.setPaint(new Color(107,28,8));
		g2D.fillOval(256, 193, 15, 15);
		
//		Mata Dalam2 brown
		g2D.setPaint(new Color(107,28,8));
		g2D.fillOval(289, 193, 15, 15);
		
//		Hidung red
		g2D.setPaint(new Color(170,3,17));
		g2D.fillOval(270, 230, 8, 8);
		g2D.fillOval(280, 230, 8, 8);
		
//		Mulut red
		g2D.setPaint(new Color(170,3,17));
		g2D.fillArc(265, 255, 30, 15, 0, 180);
		g2D.fillArc(265, 256, 30, 15, 0, -180);
		
//		Telinga kiri blue
		g2D.setPaint(new Color(3,107,183));
		g2D.rotate(45, 50, 60);
		g2D.fillOval(200, -60, 15, 65);
		
//		Tanduk kiri black
		g2D.setPaint(new Color(26,24,24));
		g2D.rotate(140, 50, 60);
		g2D.fillOval(-130, -55, 10, 30);
		
//		Tanduk Kiri black
		g2D.setPaint(new Color(26,24,24));
		g2D.rotate(45, 50, 30);
		g2D.fillOval(-155, 165, 10, 30);
		
//		Telinga Kanan blue
		g2D.setPaint(new Color(3,107,183));
		g2D.rotate(270, -10, 100);
		g2D.fillOval(-258, 120, 65, 15);
		
	}

}

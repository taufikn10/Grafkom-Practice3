package Menggambar;

import javax.swing.*;

public class  Frame extends JFrame{
	
	GraphicsD graphics = new GraphicsD();
	
	public Frame(){
		 this.setSize(600,600);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.add(graphics);
		 this.setVisible(true);
		 this.setTitle("Gambaran Taufik Nurrahman (019)");
		 
	 }

}

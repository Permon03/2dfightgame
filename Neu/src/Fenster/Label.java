package Fenster;

import java.awt.Color;
import java.awt.Graphics;
import Variablen.Variablen;
import movment.Physics;

import javax.swing.JLabel;

public class Label extends JLabel{
	
	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(Variablen.px,Variablen.py,Variablen.pw,Variablen.ph);//Player
		g.fillRect(0,Variablen.groundy,Variablen.jfw, Variablen.jfh);//ground
		
		
		
		repaint();
	}

}

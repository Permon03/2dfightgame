package Fenster;

import javax.swing.JFrame;
import Variablen.Variablen;
import Input.keylistener;

public class Fenster {
	JFrame jf= new JFrame ();
	Label lb, gb;
	public Fenster (String title, int sizewidth, int sizeheight) {
		jf.setTitle(title);
		jf.setSize(sizewidth, sizeheight);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.addKeyListener(new keylistener());
		
		lb = new Label();
		lb.setVisible(true);
		lb.setBounds(0, 0, sizewidth, sizeheight);
		jf.add(lb);
		
		Variablen.jfw = sizewidth;
		Variablen.jfh = sizeheight;
	
		//teswt ich dwbrehnwbdr4nliqwmierv3
		Variablen.groundy = Variablen.jfh-100;

	}

}

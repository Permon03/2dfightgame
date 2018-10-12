package Input;
import Variablen.Variablen;
import movment.Jump;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistener implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_D) {
			Debug.Log("TEStDDDD");
		}
		if (k.getKeyCode() == KeyEvent.VK_SPACE) {
			new Jump(50,2);					     
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


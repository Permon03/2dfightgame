package movment;

import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;

import Variablen.Variablen;

public class Physics {
	
	Timer tm;
	public static Rectangle ground;
	public static Rectangle player;
	
	public static boolean isfalling = false;
	
	public Physics() {
		tm = new Timer();
		
		ground = new Rectangle();
		player = new Rectangle();
		
		tm.scheduleAtFixedRate(new TimerTask() {
			

			@Override
			public void run() {
				if (Jump.isjumping == false) {	
				
					ground.setBounds(0, Variablen.groundy, Variablen.jfw, Variablen.jfh);
                    player.setBounds(Variablen.px,Variablen.py,Variablen.pw,Variablen.ph);
						if(player.intersects(ground) == true) {
							isfalling = false;
						
						}else {
							isfalling = true;
							Variablen.py++;
							
						}
					
					
				}
			}
			
		},0,20);
		
	}

}

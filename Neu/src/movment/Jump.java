package movment;
import java.util.Timer;
import java.util.TimerTask;

import Variablen.Variablen;

public class Jump {
	
	Timer tm;//Timer erstellen
	int i = 0;//zum hochzählen das nur x Block hochspringt
	public static boolean isjumping = false;//kein Doppelsprung
	
	public Jump(final int height, final int delay) {
		if (isjumping ==false && Physics.isfalling == false){
			tm = new Timer();
			tm.scheduleAtFixedRate(new TimerTask() {

				@Override
				public void run() {
					Variablen.py--;
					i++;
					if(i>=height) {
						tm.cancel();
						isjumping = false;
						i = 0;
					}
				}
			}, 0,delay);
			
		}

   }
}	
	

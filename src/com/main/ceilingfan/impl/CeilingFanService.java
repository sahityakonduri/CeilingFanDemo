package com.main.ceilingfan.impl;

import com.main.ceilingfan.modal.CeilingFan;
import com.main.ceilingfan.modal.FanSpeed;

public class CeilingFanService {
    /*
     *  One increases the speed each time it is pulled.  There are 3 speed settings, 
     *  and an “off” (speed 0) setting. If the cord is pulled on speed 3, 
     *  the fan returns to the “off” setting.
     */
    public static void pullCord(CeilingFan fan) {
   	 if(fan.getSpeed() == FanSpeed.HIGH) {
   		 fan.setSpeed(FanSpeed.OFF);
   	 } else {
   		 int fanSpeed = fan.getSpeed().ordinal() + 1;
   		 setFanSpeed(fan, fanSpeed);
   	 }
    }
    
    /*
     * One reverses the direction of the fan at the current speed setting.
     * Once the direction has been reversed, it remains reversed as we cycle through the speed settings, 
     * until reversed again.
     */
    public static void reverseCord(CeilingFan fan) {
    	int fanSpeed = fan.getSpeed().ordinal() - 1;
    	if( fanSpeed <= 3) {
    		setFanSpeed(fan, fanSpeed);
    	} else {
    		fan.setSpeed(FanSpeed.LOW);
    	}
    }
    
    private static void setFanSpeed(CeilingFan fan, int fanSpeed) {
    	switch(fanSpeed) {
  		 case 1:
  			 fan.setSpeed(FanSpeed.LOW);
  			 break;
  		 case 2:
  			 fan.setSpeed(FanSpeed.MEDIUM);
  			 break;
  		 case 3: 
  			 fan.setSpeed(FanSpeed.HIGH);
  			 break;
  		 }  
    }

}

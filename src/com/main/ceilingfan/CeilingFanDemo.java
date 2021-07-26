package com.main.ceilingfan;

import com.main.ceilingfan.impl.CeilingFanService;
import com.main.ceilingfan.modal.CeilingFan;

public class CeilingFanDemo {
	 
	
     public static void main(String[] args) {
    	 CeilingFan fan = new CeilingFan(); // Fan Switch ON and at LOW speed
    	 CeilingFanService fanSrv = new CeilingFanService();
    	 
    	 System.out.println("Initial FAN speed : " + fan.getSpeed());
    	 
    	 fanSrv.pullCord(fan); // increased speed by 1
    	 System.out.println("Pulled Cord , Current FAN speed : " + fan.getSpeed());
    	 
       	 fanSrv.pullCord(fan); // increased speed by 1
    	 System.out.println("Pulled Cord one more time , Current FAN speed : " + fan.getSpeed());

    	 fanSrv.reverseCord(fan); // reverse by 1
    	 System.out.println("Reveresed the direction, Current FAN speed : " + fan.getSpeed());
    	 
    	 fanSrv.reverseCord(fan); // reverse by 1
    	 System.out.println("Reveresed the direction one more time, Current FAN speed : " + fan.getSpeed());
    	 
     }
     
 }

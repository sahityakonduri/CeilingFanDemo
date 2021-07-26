package com.main.ceilingfan.modal;

public class CeilingFan {

	private FanSpeed speed;
	private boolean on;

	/** Constructor that creates a default fan */
	public CeilingFan() {
		speed = FanSpeed.LOW;
		on = true;
	}

	public FanSpeed getSpeed() {
		return speed;
	}

	public void setSpeed(FanSpeed speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	
	
}

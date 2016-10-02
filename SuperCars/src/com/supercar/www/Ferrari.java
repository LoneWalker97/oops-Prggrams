package com.supercar.www;

public class Ferrari extends Car {

	public Ferrari() {
		super();
	}
	public void accelerate(){
		
		speed=speed+20;
		if(speed>maxSpeed)
			speed=maxSpeed;
		System.out.println("Ferrari Speed:"+speed);
		
	}
	public void brake(){
		
		speed=speed-40;
		if(speed<0)
			speed=0;
		System.out.println("Ferrari Braking:"+speed);
	}
	
}

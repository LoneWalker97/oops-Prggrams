package com.supercar.www;

public class BMW extends Car{

	public BMW() {
	
		super();
	}
public void accelerate(){
		
		speed=speed+30;
		if(speed>maxSpeed)
			speed=maxSpeed;
		System.out.println("BMW Speed:"+speed);
		
	}
	public void brake(){
		
		speed=speed-50;
		if(speed<0)
			speed=0;
		System.out.println("BMW Braking:"+speed);
	}
}

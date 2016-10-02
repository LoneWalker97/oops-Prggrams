package com.supercar.www;

import java.util.Scanner;

public class Car {

	String color;
	String name;
	int noOfSeats;
	float maxSpeed;
	double speed=10;
	Scanner in=new Scanner(System.in);
	
	public Car() {
		System.out.println("Enter The Car details");
		System.out.println("************************");
		System.out.println("NAME:");
		this.name=in.next();
		System.out.println("Colour:");
		this.color=in.next();
		System.out.println("MAX SPEED:");
		this.maxSpeed=in.nextFloat();
		System.out.println("No Of Seats:");
		this.noOfSeats=in.nextInt();
		
	}
	public void accelerate(){
		
	}
	public void brake(){
	
	}
}

package oops;


import java.util.Scanner;

public class Library {
	
	Scanner input=new Scanner(System.in);
	
	int penalty;
	private int day;
	private int t;
	
	
	public void refernceTime(){
		System.out.println("Enter Reference Section Time");
		this.t=input.nextInt();
		if(t>4)
			{System.out.println("Visting Reference Section Time is Finished");
			System.out.println("Plz Leave ASAP");}
		else
			System.out.println("U May Continue Reading");
	}
	
	
	public void lendingPenalty(){
		System.out.println("Enter the No. of days of book lended");
		this.day=input.nextInt();
		if(day>15 && day<22)
			penalty=(day-15)*20;
		else if(day>22 && day<29)
			penalty=(day-22)*50;
		else if(day>29 && day<36)
			penalty=(day-29)*150;
		else if(day>36)
			penalty=(day-36)*300;
		else
			penalty=0;
		System.out.println("Delay Penalty:"+penalty);
	}
	public void digitlib(){
		int x;
		System.out.println("Enter Hours of usage of Digital Library");
		x=input.nextInt();
		if(x<=2){
			System.out.println("Continue reading"+(x-2)+"Hours");
		}
		else
			System.out.println("Plzz leave the Digital Library Time Up!!!!!");
		System.out.println("Entered hours:"+x);
	}
	public void qpapers() {
		System.out.println("Question paper from All the year 2000 to 2015 are present");
		
	}
	
	

}

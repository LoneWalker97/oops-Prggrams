import java.util.Scanner;


public class Traveler {
	

	
	private static int iTravelerID;
	private String sTravelerName;
	private long lTravelerContactNo;
	private float fBaggageAmount;
	private int iExpiryYear;
	private boolean bNOCStatus;
	
	
	Scanner input=new Scanner(System.in);
	
	public Traveler(){
		Traveler.iTravelerID=Traveler.iTravelerID+1; 
		System.out.print("ID:"+Traveler.iTravelerID+"\n");
		System.out.print("\n Name: ");
		this.sTravelerName=input.next();
		System.out.print("\n Contact No:");
		this.lTravelerContactNo=input.nextLong();
		System.out.print("\n BaggageAmt: ");
		this.fBaggageAmount=input.nextFloat();
		System.out.print("\n Expiry: ");
		this.iExpiryYear=input.nextInt();
		System.out.print("\n NOCstatus: ");
		this.bNOCStatus=input.nextBoolean();
			
	} 
	
	
	
	
	public boolean validateName(){
		
		if(this.sTravelerName.length() >=4 && this.sTravelerName.length()<=20 )
			return true;
		else
			return false;
		
	}
	
	public boolean validateContactNo(){
		if(this.lTravelerContactNo>6999999999l)
			return true;
		else 
			return false;
	}
	
	public boolean checkBaggage(Traveler object){
		if(this.fBaggageAmount>=0 && this.fBaggageAmount<=40)
			return true;
		else
			return false;
	
	}

	public boolean checkImmigration(Traveler object){
		if(this.iExpiryYear>=2001 && this.iExpiryYear<=2025)
			return true;
		else 
			return false;
	}
	


	public boolean checkSecurity(Traveler object){
		if(this.bNOCStatus==true)
			return true;
		else
			return false;
		
	}
	
	public void displayInformation(Traveler object){
		System.out.println("ID:"+Traveler.iTravelerID);
		System.out.println("Name:"+this.sTravelerName);
		System.out.println("ContactNo:"+this.lTravelerContactNo);
		System.out.println("Checking Name........"+ validateName());
		System.out.println("Checking ContactNo......."+ validateContactNo());
		if(validateContactNo()==false)
			System.out.println("Plzz Enter valid Number....");
		System.out.println("Checking BaggageAMT......"+checkBaggage( object));
		System.out.println("Checking Immigration.."+checkImmigration(object));
		System.out.println("Checking NOC status..."+checkSecurity(object));
		
		
	}
   
	

	

}

 
class Company implements Project {
	
	private String CmpName;
	static int CmpID;
	private String Cmpaddress;
	int choice;
	private double CmpProfit;
	
	public Company() {
		
		System.out.println("Project Name:"+projectName);
		System.out.println("Project ID:"+projectID);
		System.out.println("Enter Company Details");
		System.out.println("**************************");
		CmpID++;
		System.out.println("Company ID:"+CmpID);
		System.out.print("\nCompany Name:");
		this.CmpName=in.next();
		System.out.print("\nCompany Address:");
		this.Cmpaddress=in.next();
		System.out.print("\nCompany Profit:");
		this.CmpProfit=in.nextDouble();
		
	}
	
public void assignment(){
		
		System.out.println("\nYour Company have been assigned the project");
		System.out.println("");
		System.out.println("Is your Company willing to take the assignment");
		System.out.println("Enter 1 for yes and 0 for No");
		System.out.print("Choice:");
		this.choice=in.nextInt();
		if(choice==1)
			{System.out.println("Congratulations!! You will be awarded Profit amount for completing Assignment");
			 bouns();
			}
		else
		{System.out.println("No Problem Work Hard!!!.......");}
	}
	
	
	public void bouns(){
		
		System.out.println("Bouns is 10% of salary");
		CmpProfit=CmpProfit * 0.1 +CmpProfit;
		System.out.println("Total Profit:"+CmpProfit);
	}

}

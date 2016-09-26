
public class Customer {
	
	 int iCustID;
	 String sCustName;
	 String sAddress;
	 long lTeleNo;


	long validateTeleNo(long a)
	{
		if(a>6999999999l)
			System.out.println("Ture");
		else
			System.out.println("False");
     return 0;		
	}
	
	int validateCustName(String Nam){
		int i;
		i=Nam.length();
		if(i>=4 && i<=20)
			return 1;
		else
			return 0;
			
	}
	
	
	

}

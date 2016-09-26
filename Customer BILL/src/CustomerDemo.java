
public class CustomerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer newcust=new Customer();
		newcust.iCustID=111;
		newcust.sAddress="7th cross KRC layout 236 sangam building Dharwad 580001";
		newcust.sCustName="Yogesh";
		newcust.lTeleNo=9448225067l;
		
		

		System.out.println("Validating PhoneNo......");
	    newcust.validateTeleNo(newcust.lTeleNo);
	    System.out.println("Validating Name..........");
	    long i=0;
	    i=newcust.validateCustName(newcust.sCustName);
	    if(i==1)
	    	System.out.println("Ture");
	    else
	    	System.out.println("false");
	    
	    System.out.println("Customer Details");
	    System.out.println("******************");
	    System.out.println("ID="+ newcust.iCustID);
		System.out.println("Name="+ newcust.sCustName);
		System.out.println("PhoneNo="+newcust.lTeleNo);
		System.out.println("Address="+newcust.sAddress);
	    
	    
	    
	}

}


public class ItemDetailsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ItemDetails Customer=new ItemDetails();
		Customer.iItemID=1006;
		Customer.dItemPrice=200;
		System.out.println("Validating Amt & ID........");
		int i=0;
		i=Customer.validateItemID(Customer.iItemID,Customer.dItemPrice);
		if(i==1)
			{System.out.println("True");
			System.out.println("\n");
			System.out.println("Item Details");
			System.out.println("**************");
			System.out.println("Item ID="+Customer.iItemID);
			System.out.println("Item Price="+Customer.dItemPrice);
			}
		else
			{System.out.println("False");
			System.out.println("Sorry!! :(");
			System.out.println("No Details");}
		
		
		
		

	}

}

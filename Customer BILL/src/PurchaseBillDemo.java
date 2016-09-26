
public class PurchaseBillDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PurchaseBill Customer=new PurchaseBill();
		Customer.iBillID=1089;
		Customer.iQty=3;
		
		ItemDetails cust=new ItemDetails();
		
		Customer.calculateBill(Customer.dBillAmt);
		
		
		System.out.println("Product Details");
		System.out.println("*****************");
		System.out.println("Bill ID="+Customer.iBillID);
		System.out.println("Quantity="+Customer.iQty);
		System.out.println("Amount="+Customer.dBillAmt);
		
		System.out.println("\n");
		
		System.out.println("Bill Amount="+Customer.total);

	}

}

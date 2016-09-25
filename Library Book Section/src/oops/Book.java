package oops;

	import java.util.Scanner;

	public class Book{
		Scanner input=new Scanner(System.in);
		static int  iBookId=1;
		String sTitle;
		String sDepart;
		String sSubject;
		double dPrice;
		int iChoice;
		
		public Book() {
			
			iBookId++;
			System.out.print("\nTitle:");
			this.sTitle=input.next();
			System.out.print("\nDepartment:");
			this.sDepart=input.next();
			System.out.print("\nSubject:");
			this.sSubject=input.next();
			System.out.print("\nPrice:");
			this.dPrice=input.nextDouble();
			System.out.println("Do You Want to......");
			System.out.print("\n1.Refer the Book\n2.Borrow\n3.See In Digital Section\n4.Refer Subject Realated Question papers");
			this.iChoice=input.nextInt();
		}
		void printbookdetails(){
			System.out.println("Book Deatails");
			System.out.println("*******************");
			System.out.println("ISBN:"+iBookId);
			System.out.println("Tile:"+sTitle);
			System.out.println("Department:"+sDepart);
			System.out.println("Subject:"+sSubject);
			System.out.println("Price:"+dPrice);
			System.out.println("Choice Selected is:"+this.iChoice);
			System.out.println("\n");
		}
		
		
	}




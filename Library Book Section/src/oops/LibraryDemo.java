package oops;



public class LibraryDemo {

	
	public static void main(String[] args) {
		
		System.out.println("Enter Book Details");
		Book b=new Book();
		b.printbookdetails();
		Library visitor=new Library();
		if(b.iChoice==1){
			visitor.refernceTime();
		}
		else if(b.iChoice==2){
			visitor.lendingPenalty();
		}
		else if(b.iChoice==3){
			visitor.digitlib();
		}
		else if(b.iChoice==4){
			visitor.qpapers();
		}
		
	}

}

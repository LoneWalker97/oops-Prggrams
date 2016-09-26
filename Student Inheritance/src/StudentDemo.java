import java.util.*;
class Student {
	static int stuId;
	static String stuName;
	static Address address;		//initialising Address object
	
	Student(){
		
	}
	Student(int sId,String sName) {
		this.stuId=sId;
		this.stuName=sName;
		}
	
	static Student[] createStudents(){
		Student[] s=new Student[5];
		int i;
		Scanner sc1=new Scanner(System.in);
		for(i=0;i<=5;i++){
			System.out.println("Enter the id of student "+i+1);
			stuId=sc1.nextInt();
			System.out.println("Enter the name of student "+i+1);
			stuName=sc1.next();
			System.out.println("Enter the address of student "+i+1);
			String address=sc1.next();
		}
		return s;
	}
	static void printStudents(Student[] students){
		int i;
		for(i=0;i<=5;i++){
			System.out.println("The address of student "+(i+1)+ "is"+address);
			
		}
	}
	void changeAddress(Student[] students, int sId){
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the address to be changed:");
		String address=sc1.next();
	}

	static Student searchStudent(Student[] students, Address address){
		System.out.println("Enter id whose address has to be changed");
		Scanner sc1=new Scanner(System.in);
		int id=sc1.nextInt();
		int i;
		for(i=0;i<=5;i++){
			if(id==students.studId){
				return address;	
			}
			else{
				System.out.println("ERROR-Student not found");
				return null;
			}
		}
		return address;
		
	}
}
	class Address extends Student{
		String street;
		String city;
		int pinCode;
		
	
		Address(String street,String city,int pinCode){
			this.street=street;
			this.city=city;
			this.pinCode=pinCode;
			}
		
		
		}
	
	public class StudentDemo {


	public static void main(String[] args) {
		Student student=new Student();  // default constructor
		Student[] students=Student.createStudents(); // get array of Students
		Student.printStudents(students);
		Student.changeAddress(students, id);
		Address add1=new Address(street,city,pinCode);
		Student.searchStudent(students, add1);

	}

}

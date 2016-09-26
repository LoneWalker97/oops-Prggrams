import java.util.Scanner;


public class Employee {
	private static int iEmpID;
	private String sEmpName;
	private float fEmpBasicSalary;
	private float fAllowance;
	float Gross;
	float incometax;
	private String sDesignation;
	
	Scanner input=new Scanner(System.in);
	
	public Employee(){
		++iEmpID;
		System.out.println("EmpID :"+iEmpID);
		System.out.print("Name:");
		this.sEmpName=input.next();
		System.out.println("Salary:");
		this.fEmpBasicSalary=input.nextFloat();
		System.out.print("Designation options \n 1.Project Manager \n 2.Team Leader \n 3.Software Engineer \n 4.System Engineer\n");
		System.out.println("Enter Deignation:");
		this.sDesignation=input.next();
		
	}
	
	public float calAllowance(){
		fAllowance=this.fEmpBasicSalary * 0.46f;
		
		return fAllowance;
		
	}
	
	public float calGross(){
		
		Gross=fAllowance+this.fEmpBasicSalary;
		return Gross;
	}
	public float calIncomeTax(){
		
		if(this.fEmpBasicSalary<=5000)
			{this.incometax=this.fEmpBasicSalary * 0;
			float netpay = Gross -this.fEmpBasicSalary;
			return  netpay;}
		else if(this.fEmpBasicSalary>=5001 && this.fEmpBasicSalary<=10000)
		{
			this.incometax=this.fEmpBasicSalary * 0.1f;
			float netpay = Gross -this.fEmpBasicSalary;
			return  netpay;
		}
		else if(this.fEmpBasicSalary>=10001 && this.fEmpBasicSalary<=20000)
		{
			this.incometax=this.fEmpBasicSalary * 0.2f;
			float netpay = Gross -this.fEmpBasicSalary;
			return netpay;
		}
		else 
		{
			this.incometax = this.fEmpBasicSalary * 0.3f;
			float netpay = Gross -this.fEmpBasicSalary;
			return  netpay;
		}
	
	}
	public void checkDesignation(){
		if(this.sDesignation=="Project Manager")
			System.out.println("2 Projects can be assigned");
		else
			System.out.println("Only 1 project can be assigned");
	}
	
	public void dispaly(Employee object){
		System.out.println("Employee Details");
		System.out.println("*******************************");
		System.out.println("EmpID:"+iEmpID);
		System.out.println("Name:"+this.sEmpName);
		System.out.println("Basic Salary:"+this.fEmpBasicSalary);
		System.out.println("Allowance:"+calAllowance());
		System.out.println("Gross Pay:"+calGross());
		System.out.println("Income Tax:"+this.incometax);
		System.out.println("Net Pay:"+calIncomeTax());
		System.out.println("Designation Status.....");
		checkDesignation();
	}

}

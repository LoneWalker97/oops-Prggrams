
 class employee implements Project {
	 
	 private String Name;
		public static int ID=0;
		private double salary;
		int choice;
		
		
		public employee() {
			
			System.out.println("Project Name:"+projectName);
			System.out.println("Project ID:"+projectID);
			System.out.println("Enter Employee Details");
			System.out.println("**************************");
			ID++;
			System.out.println("EmpID:"+ID);
			System.out.print("\nName:");
			this.Name=in.next();
			System.out.print("\nSalary:");
			this.salary=in.nextDouble();
		}
	public void assignment(){
			
			System.out.println("You have been assigned the project");
			System.out.println("");
			System.out.println("Are you willing to take the assignment");
			System.out.println("Enter 1 for yes and 0 for No");
			System.out.print("Choice:");
			this.choice=in.nextInt();
			if(choice==1)
				{System.out.println("Congratulations!! You will be awarded bouns salary for completing Assignment");
				 bouns();
				}
			else
			{System.out.println("No Problem Work Hard!!!.......");}
		}
		
		
		public void bouns(){
			
			System.out.println("Bouns is 10% of salary");
			salary=salary * 0.1 +salary;
			System.out.println("Total salary:"+salary);
		}
		

}

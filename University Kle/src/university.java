
 class university {
	  private String School;
	  private int ProgramCode;
	  double NoofStaff;
	  private String HOD;
	  
	public String getSchool() {
		return School;
	}

	public int getProgramCode() {
		return ProgramCode;
	}

	public double getNoofStaff() {
		return NoofStaff;
	}

	public String getHOD() {
		return HOD;
	}
    
	public university(String school) {
		School = school;
	}

	public university(int programCode,double noofStaff, String hOD) {
		super();
		ProgramCode = programCode;
		NoofStaff = noofStaff;
		HOD = hOD;
	}
	  
	
 }

 
 class Student extends university
 {
	 String name;
	 static int nostd=0;
	 public Student(String school, int programCode, double noofStaff, String hOD, String name) {	 
	 super( programCode, noofStaff, hOD);
	 this.name=name;
	 
	 nostd++;
	
	 
	 if(nostd>1)
	 {
		 System.err.println("ADDMISSION OVER");
		
	 }
	 else
	 {
		 System.err.println("WELCOME TO UNIVERSITY");
		 System.out.println("The strength is " + nostd++);
	 }
	 
	 }
	 
	
 }
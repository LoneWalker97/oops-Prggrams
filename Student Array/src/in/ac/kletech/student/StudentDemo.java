package in.ac.kletech.student;

public class StudentDemo {

	
	public static void main(String[] args) {
		Student Abc = new Student();
		System.out.println(Abc.numBest(1f, 2f, 3f));
		// TODO Auto-generated method stub
     Student Abcd[]= new Student[10];
      
     for (int i=0;i<10;i++)
    	  Abcd[i]= new Student();
     
     System.out.println(Abcd[0].numBest(10f,40f,1f));
     System.out.println(Abcd[1].numBest(20f,40f,1f));
     System.out.println(Abcd[2].numBest(10f,30f,1f));
     System.out.println(Abcd[3].numBest(40f,40f,1f));
     System.out.println(Abcd[4].numBest(10f,80f,1f));
     System.out.println(Abcd[5].numBest(10f,40f,1f));
     System.out.println(Abcd[6].numBest(10f,90f,1f));
     System.out.println(Abcd[7].numBest(10f,40f,5f));
     System.out.println(Abcd[8].numBest(90f,40f,1f));
     System.out.println(Abcd[9].numBest(10f,40f,6f));

     
     
     
	}

}

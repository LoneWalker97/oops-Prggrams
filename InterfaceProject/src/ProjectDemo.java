
public class ProjectDemo {

	
	public static void main(String[] args) {
		employee[] e=new employee[2];
		Company[] c=new Company[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("");
			e[i]=new employee();
			e[i].assignment();
			System.out.println("");
			c[i]=new Company();
			c[i].assignment();
		}
	}

}

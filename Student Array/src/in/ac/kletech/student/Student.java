package in.ac.kletech.student;

public class Student {
	float numBest (float fNUM1,float fNUM2,float fNUM3){
		if(fNUM1<fNUM2 && fNUM1<fNUM3)
			return(fNUM3 + fNUM2);
		else if(fNUM2<fNUM3 && fNUM2<fNUM1)
			return(fNUM3 + fNUM1);
		else 
			return(fNUM2 + fNUM3);
		
	}
}

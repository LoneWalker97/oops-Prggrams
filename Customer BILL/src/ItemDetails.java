
public class ItemDetails {
	int iItemID;
	double dItemPrice;
    
	int validateItemID(int a,double b){
		if(a>=1001 && a<=1005)
		{if(b>=5)
			return 1;
		else
			return 0;
		}
	return 0;
}
}
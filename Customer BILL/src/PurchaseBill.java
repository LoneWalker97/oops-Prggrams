
public class PurchaseBill {
	int iBillID;
	int iQty;
	double dBillAmt;
	double total=0;
	double disc=0;
	double calculateBill(double a){
		total=iQty*a;
		if(total>=1000)
		  {disc=total*0.1;
		  }
		else if(total>=500)
		  {disc=total*0.05;
		  }
		else
		{disc=total*0;
		  }
		total=total-disc;
		return total;
	}

}

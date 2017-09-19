package hum;

public class ccg {
	public double cal(double sale) {
	double sum=0;
	if(sale>50001)
	{
		sum = sale*0.03;
	}else if(sale>25001){
		sum = sale*0.02;
	}else if(sale>1) {
		sum = sale*0.01;
		
	}
	return sum;
}
}

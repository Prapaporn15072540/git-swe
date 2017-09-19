package hum;

public class ccg {
	public double cal(double sale, double salary) {
	double sum = 0;
	if(sale>=1||sale<=50000)
	{
		sum = salary+(sale*0.01);
	}
	if(sale>=50001||sale<=100000){
		sum = salary+(sale*0.02);
	}if(sale>=100001) {
		sum = salary+(sale*0.03);
		
	}
	return sum;
}
}

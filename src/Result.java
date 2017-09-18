
public class Result  {
	public int n;
	public String str;
	public Result(int n) {
		this.n=n;
		
		// TODO Auto-generated method stub
		
}
	public String output() {
		if(n%2==0) {
			str=("Number is Even ");
		}else {
			str=("Number is Odd ");
		}
		return str;
	}
	
	
	
}
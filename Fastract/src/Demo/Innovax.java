package Demo;

public class Innovax {
	public static void main(String[] args) {
		double var=83848.7;
		double temp=var;
		while(temp%2<=1) {
			double id=temp%2;
			if(id>=0 && id<=0.4) {
				var-=id;
				System.out.println(var);
				break;
			}
			else
			{
				double end=1-id;
				var+=end;
				System.out.println(var);
				break;
			}
		}			
	}
}

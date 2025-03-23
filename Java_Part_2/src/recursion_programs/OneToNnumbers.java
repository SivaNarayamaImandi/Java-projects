package recursion_programs;

public class OneToNnumbers {
	static int i = 1;
	static int sum = 0;
	static int count = 0;

	static void series(int n) {
		if (i > n) {
			System.out.println(sum);
			return;
		} else {
			if(i%2==1&&count<5) {
				sum+=i;
				count++;
			}
			i++;
			series(n);
		}
	}

	public static void main(String[] args) {
		series(50); //passing from 1-50   
		System.out.println(1+3+5+7+9);
	}
}
//fast
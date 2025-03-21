package Demo;

public class Test1 {
	public static void main(String[] args) {
		int i = 1;// 1,2,3,4,10
		while (i !=11 )// 1!=11 -->true 2!=11 -->true 3!11-->true
		{
			//4!=11 -->true 10!11 -->true 11!=11 -->false
			System.out.println(i);// 1,2,3,4,10
			i++; //2,3,4,5,11
		}
	}
}
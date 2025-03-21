package Demo;

public class AccountNo {
	public static int accNo;
	public static AccountNo ac=null;
	public AccountNo(int accNo) {
		this.accNo = accNo;
		display();
	}
	public static  void display() {
		System.out.println(accNo);
	}
	public static void createAcc()
	{
		if(ac==null)
			ac=new AccountNo(1234);
		else
			System.out.println("Account is already created...");
	}
}

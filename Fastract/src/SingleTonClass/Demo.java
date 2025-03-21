package SingleTonClass;

public class Demo {
	public int aadharNo;
	public static Demo d = null; //new Demo(86756467)

	private Demo(int aadharNo) {
		this.aadharNo = aadharNo;
	}

	public static void createAadhar() {
		if (d == null) {
			d = new Demo(86756467);
			System.out.println("Aadhar Created......");
			d.dispay();
		} else {
			System.out.println("Already Aadhar Created......");
		}
	}

	public void dispay() {
		System.out.println("Your account no is " + aadharNo);
	}
}

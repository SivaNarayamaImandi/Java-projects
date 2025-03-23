package downCasting;

public class MainClass1 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Test t = (Test) new Result();
		t.test();
		Result r=(Result)t;
		r.result();
	}
}

package Demo;

public class SpecMain {
	public static void education(Specilization sp)
	{
		sp.study();
		sp.write();
		sp.exam();
	}
	public static void main(String[] args) {
		education(new Specilization());
		education(new Specilization());
	}
}

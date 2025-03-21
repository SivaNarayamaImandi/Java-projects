package Demo;

public class EcceptionPro extends Exception{
	@Override
	public String toString() {
		return getClass()+" Don't Divide with number";
	}
}

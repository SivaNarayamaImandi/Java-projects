package practice_programs;

public class StringAddAnotherStringSpecificIndexValue {
	public static void main(String[] args) {
		String oString="JAVA HTML";
		String iString="SQL ";
		int index=4;
		String string=new String();
		for (int i = 0; i < oString.length(); i++) {
			string+=oString.charAt(i);
			if(i==index)
			{
				string+=iString;
			}
		}
		System.out.println(string);
	}
}

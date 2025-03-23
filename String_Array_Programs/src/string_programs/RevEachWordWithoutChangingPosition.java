package string_programs;

public class RevEachWordWithoutChangingPosition {
public static void main(String[] args) {
	//WAPT REDA a sentance and reverse each word without changing its position
	//ex:how are you 
	//output: woh era uoy
	String s="How are you";
	String[] split = s.split(" ");
	String rev="";
	for (int i = 0; i < split.length; i++) {
		String string = split[i];
		//System.out.println(string);
		for (int j = string.length() - 1; j >= 0; j--) {
			char charAt = string.charAt(j);
			rev = rev + charAt;
		}
	}
	System.out.println(rev);
}
}

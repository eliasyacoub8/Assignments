package patternmatcher;
import java.util.regex.Pattern;
public class matchingconditions {

	public static void main(String[] args) {
		System.out.println (Pattern.matches("([a-zA-Z0-9]*)@([a-zA-Z0-9]*).com", "firstname@gmail.com"));
		System.out.println (Pattern.matches("([a-zA-Z0-9]*)@([a-zA-Z0-9]*).com", "virendra@gmail.com"));
		System.out.println (Pattern.matches("([a-zA-Z0-9]*)@([a-zA-Z0-9.]*).com", "test123prepare@co.edu.com"));
		System.out.println (Pattern.matches("[+]91([0-9]*)", "+9137937376887546"));
		System.out.println (Pattern.matches("[A-Z]{1}\\d{3}[a-zA-Z]{6}", "A987atshdg"));
		
	}

	
}

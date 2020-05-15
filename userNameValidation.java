package stringJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userNameValidation {

	public static void main(String[] args) {
		String userName="bshjgjchjknl";
		String regexPattern = "[a-zA-Z0-9_@$.]{8,}";
		Pattern pat = Pattern.compile(regexPattern);
		Matcher mat = pat.matcher(userName);
		boolean out = mat.matches();
		if(out==false)
		{
			System.out.println("username not valid");
		}
		else
		{
			System.out.println("usename valid");
		}

	}

}

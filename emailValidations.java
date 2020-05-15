package stringJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValidations {
	
	

	public static void main(String[] args) {
		String email="@gmail.com";
		
		String emailRegex ="^[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}"; 
		Pattern com = Pattern.compile(emailRegex);
		Matcher mat = com.matcher(email);
		boolean out = mat.matches();
		if(out==false)
		{
			System.out.println("email id not valid");
		}
		else
		{
			System.out.println("email id is valid");
		}
				
	}

}
 
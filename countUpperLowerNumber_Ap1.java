package stringJava;

public class countUpperLowerNumber_Ap1 {

	public static void main(String[] args) {
		String x = "ABC 123 ### abc";
		char y[]=x.toCharArray();
		int size=y.length;
		int upper=0;
		int lower=0;
		int spce=0;
		int number=0;
		int spl=0;
		for(int i=0;i<size;i++)
		{						
			if (Character.isUpperCase(y[i])) 
                upper++; 
            else if (Character.isLowerCase(y[i])) 
                lower++; 
            else if (Character.isDigit(y[i])) 
                number++; 
            else if (Character.isWhitespace(y[i]))
            	spce++;
            else
                spl++;
		}

		System.out.println("upper case :" + upper);
		System.out.println("lower case :" + lower);
		System.out.println("number :" + number);
		System.out.println("spce :" + spce);
		System.out.println("spl :" + spl);

	}

}

package stringJava;

public class countUpperLowerNumber_Ap2 {

	public static void main(String[] args) {
		String x = "Welcome to Testleaf 123 $$$";
		char y[]=x.toCharArray();
		int size=y.length;
		int upper=0;
		int lower=0;
		int spce=0;
		int number=0;
		int spl=0;
		for(int i=0;i<size;i++)
		{						
			if (y[i] >= 'A' && y[i] <= 'Z') 
                upper++; 
            else if (y[i] >= 'a' && y[i] <= 'z') 
                lower++; 
            else if (y[i] >= '0' && y[i] <= '9') 
                number++; 
            else if (y[i]==' ')
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

package stringJava;



public class palindrome_array {
	public static void main(String[] arg)
	{
		String x = "testleaf";
		char y[] = x.toCharArray();
		int size = y.length; 
		char a[] = new char[size];
		for(int i=0; i<size; i++)
		{
			a[size-1-i] = y[i];
		}
		
		for(int i=0; i<size; i++)
		{
			if(a[i] == y[i])
			{
				continue;
			}
			else
			{
				System.out.println("not palindrome");
				System.exit(0);
			}
		}
		System.out.println("palindrome");
	
	}

}


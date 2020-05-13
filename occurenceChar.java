package stringJava;

public class occurenceChar {

	public static void main(String[] args) {
		String x = "hello oo";
		char y[]=x.toCharArray();
		int size = y.length;
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(y[i]=='o')
			{
				++count;
			}
		}

		System.out.println(count);
	}

}

package stringJava;

public class sumOfGivenNumber_ap2 {

	public static void main(String[] args) {
		String x ="asdf1qwer9as8d7hdg22";		
		
		String reAlpha = x.replaceAll("[^0-9]", "");
		char y[]=reAlpha.toCharArray();
		System.out.println(y);
		int size=y.length;
		int sum=0;
		for(int i=0;i<size;i++)
		{
			
			sum=sum+Integer.parseInt(String.valueOf(y[i]));
		}
		
		System.out.println(sum);
	}

}

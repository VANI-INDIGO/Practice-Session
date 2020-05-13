package stringJava;

public class occurenceChar2 {

	public static void main(String[] args) {
		String str = "hello world";
		String repStr= str.replaceAll("[^o]", "");
		int count=repStr.length();
		System.out.println("Occurence of O : "+count);
		
		

	}

}

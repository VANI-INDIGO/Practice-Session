package stringJava;

public class palindrome_StringBuffer {

	public static void main(String[] args) {
		String str="hello";
		StringBuffer rev = new StringBuffer(str);
		rev.reverse();
		String data = rev.toString();
		if(str.equals(data))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}

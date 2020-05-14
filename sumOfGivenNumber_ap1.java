package stringJava;

public class sumOfGivenNumber_ap1 {

	public static void main(String[] args) {
		String str="jkgdhsb5nnbg2bj7";
		int sum=0;
		int temp=0;
		
		for(int i = 0; i < str.length(); i++)  
        {  
            char ch = str.charAt(i); 
              
             
            if (Character.isDigit(ch))  
            {
            	
                temp = temp+Integer.parseInt(String.valueOf(ch));
               
            }
        }

		System.out.println(temp);
	}

}

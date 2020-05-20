package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class retriveValueFromSet {

	public static void main(String[] args) {
		
		Set<Integer> no = new LinkedHashSet<Integer>();
		no.add(1);
		no.add(2);
		no.add(3);
		no.add(4);
		no.add(5);
		no.add(6);
		no.add(7);
		no.add(8);
		no.add(9);
		no.add(10);
		
		for( Integer number : no)
		{
			if(number==7)
				System.out.println(number);
		}

	}

}

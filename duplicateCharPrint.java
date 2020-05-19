package stringJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class duplicateCharPrint {

	public static void main(String[] args) {
		String x = "When life gives you lemons, make lemonade";			
		char y[] = x.toCharArray();
		int size = y.length;
		Map<Character , Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<size; i++)
		{
			if(map.containsKey(y[i]) == false)
			{
				map.put(y[i],1);
			}
			else
			{
				int oldval = map.get(y[i]);
				int newval = oldval+1;
				map.put(y[i], newval);
			}
		}
		
		Set<Map.Entry<Character, Integer>> character = map.entrySet();
		for(Map.Entry<Character, Integer> data : character)
		{
			if(data.getValue() > 1)
			{
				System.out.print(data.getKey());
				
			}
		}
		
		

	}

}

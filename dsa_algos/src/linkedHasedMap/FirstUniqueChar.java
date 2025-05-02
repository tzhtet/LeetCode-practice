package linkedHasedMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
	
	//swiss
	
	public static Character findFirstNonRepeating(String input) {
		if(input == null || input.isEmpty()) {
			return null;
		}
		
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		
		for(char c: input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
		}
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; 
	}

}

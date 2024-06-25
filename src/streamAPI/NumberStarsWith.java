package streamAPI;

import java.util.Arrays;
import java.util.List;

public class NumberStarsWith {

	public static void main(String[] args) {
		
		// 2,222,234,567,890,432,236,211,22
		List<Integer> list = Arrays.asList(2,222,234,567,890,432,236,211,22);
		
				
		List<String> stringList = list.stream().map(integer -> String.valueOf(integer))
												 .filter(str -> str.charAt(0) == '2')
												 .peek(string -> System.out.println(string))
												 .toList();
		
		
		System.out.println(stringList);							
		
	}

}

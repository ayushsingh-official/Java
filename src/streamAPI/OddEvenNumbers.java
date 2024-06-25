package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEvenNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 53, 43, 76, 87, 12, 90);
		
//		list.stream()
//				.map((Integer value) -> { if(value%2 == 0) return "even : " + value;
//													  else return "odd : " + value; 
//										}).forEach((String val)-> System.out.println(val));
//		
		
		List<Integer> evenList = list.stream()
									 .filter(e -> e%2 == 0)
									 	.collect(Collectors.toList());
		
		System.out.println(evenList);
		
		List<Integer> oddList = list.stream()
				 					.filter(e -> e%2 != 0)
				 							.collect(Collectors.toList());
		System.out.println(oddList);


//		Stream<String> stream = list.stream()
//									.map((Integer value) -> { if(value%2 == 0) return "even" + value;
//											  		  					  else return "odd" + value; 
//															}).peek((String str) -> System.out.println(str))
//																.map((String string)-> string);


//		List<String> stringList = stream.collect(Collectors.toList());														

	}

}

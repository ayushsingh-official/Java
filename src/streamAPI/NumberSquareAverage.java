package streamAPI;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 10, 23, 65, 43, 32, 4);
		
		Double value = list.stream()
							.map((Integer val) -> val*val)
								.filter((Integer num) -> num>1000)
									.mapToInt((Integer val) -> val)
										.average()  
											.getAsDouble();
		
		
		System.out.println(value);
	
	}

}

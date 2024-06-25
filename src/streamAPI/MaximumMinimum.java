package streamAPI;

import java.util.Arrays;
import java.util.List;

public class MaximumMinimum {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 10, 23, 4, 1, 32, 4, 23, 32, 32, 4, 1);

		int max = list.stream()
					.max((int1,int2)-> int1 - int2).get();
		
		System.out.println("max : " + max );
		
		int min = list.stream()
				.max((int1,int2)-> int2 - int1).get();
		 
		System.out.println("min : " + min);
		
	}

}

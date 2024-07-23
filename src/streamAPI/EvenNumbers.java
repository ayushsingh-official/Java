package streamAPI;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		
		 List<Integer> list1 =   list.stream().filter((val) -> val%2 == 0).toList();
		 
		 Long count =  list.stream().filter((val) -> val%2 == 0).count();
		 
		 
		 
		 System.out.println(list1);
		 
		 System.err.println(count);
		
	}

}

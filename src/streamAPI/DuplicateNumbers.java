package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 10, 23, 4, 1, 32, 4, 23, 32, 32, 4, 1);

		HashSet<Integer> set = new HashSet<Integer>();

		List<Integer> duplicate = list.stream().filter(integer -> !set.add(integer)).toList();

		System.out.println(duplicate);

	}

}

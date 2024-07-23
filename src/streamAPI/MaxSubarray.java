package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxSubarray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };

		int k = 3;

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 1; i < a.length - 1; i++) {
			
			int mid = a[i];
			int left = a[i-1];
			int right = a[i+1];
			
			int[] subArray = new int[k];
			
			subArray[0] = left;
			subArray[1] = mid;
			subArray[2] = right;
			
			Arrays.sort(subArray);
			
			int highest = subArray[2];
			
			System.out.print(" " + highest);

		}

	}

}

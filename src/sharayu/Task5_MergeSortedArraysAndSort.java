package sharayu;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task5_MergeSortedArraysAndSort {

	public static void main(String[] args) {

		int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        
        int[] sorted=Stream.of(arr1,arr2)
        		.flatMapToInt(Arrays::stream)
        		.sorted()
        		.toArray();
        
        System.out.println(Arrays.toString(sorted));

	}

}

package sharayu;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task8_SlidingWindow {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        
        int[] result= IntStream.range(0, arr.length)
        		.map(
        				i-> IntStream.rangeClosed(Math.max(0, i-k+1), i)
        				.map(j -> arr[j])
        				.sum()
        				)
        		.toArray();
        
        System.out.println(Arrays.toString(result));

	}

}

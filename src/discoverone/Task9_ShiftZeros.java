package discoverone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task9_ShiftZeros {

	public static void main(String[] args) {
		int[] arr= {1,0,2,4,0,0,5,8,0,3};
		
		List<Integer> nonzeros=Arrays.stream(arr)
				.filter(n -> n!=0)
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println(nonzeros.toString());
		
		IntStream.range(0, arr.length-nonzeros.size())
		.forEach(i -> nonzeros.add(0));

		System.out.println(nonzeros.toString());
	}

}

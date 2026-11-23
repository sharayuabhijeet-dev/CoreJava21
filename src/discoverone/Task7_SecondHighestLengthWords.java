package discoverone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task7_SecondHighestLengthWords {

	public static void main(String[] args) {
		
		

		String str="Reach your goals cultivate self love and live life at its best";
		String[] arr=str.split("\\s");
		
		List<Integer> listResult=Arrays.stream(arr)
				.map(String::length)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		if(listResult.size()<2) {
			System.out.println("Not enough elements to compare");
			return;
		}
		
			int high2=listResult.get(1);
			System.out.println("Second Highest length - "+high2);
		
		
		IntStream.range(0, arr.length)
		.filter(i -> arr[i].length()==high2)
		.forEach(i -> System.out.println(arr[i]+" has length "+arr[i].length()));

	}

}

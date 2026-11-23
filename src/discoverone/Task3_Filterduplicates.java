package discoverone;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3_Filterduplicates {

	public static void main(String[] args) {

		List<Integer> nums = List.of(1, 2, 3, 2, 4, 5, 3);
		
		nums.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue()>1)
				.forEach(entry -> System.out.println(entry.getKey()+" - "+ entry.getValue()));

	}

}

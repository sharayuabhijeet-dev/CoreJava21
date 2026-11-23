package discoverone;

import java.util.Comparator;
import java.util.List;

public class Task5_FindSecondHighest {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1, 2, 3, 2, 4, 5, 3);

		Integer secondHighest=nums.stream()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst().orElse(null);
		
		System.out.println("Second Highest - "+secondHighest);
	}

}

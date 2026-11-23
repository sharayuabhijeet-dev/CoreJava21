package discoverone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6_PartitionEvenOdds {

	public static void main(String[] args) {

		List<Integer> nums=List.of(1,2,3,4,5,6,7,8);
		
		Map<Boolean, List<Integer>> numsmap=nums.stream()
				.collect(Collectors.partitioningBy(num -> num%2==0));
				
		System.out.println(numsmap);

	}

}

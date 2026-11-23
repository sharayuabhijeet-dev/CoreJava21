package sharayu;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task9_FindDuplicates {

	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "mango", "banana", "grape");
		
		items.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue()>1)
				.forEach(entry -> System.out.println(entry.getKey()+" - "+ entry.getValue()));
				

	}

}

package discoverone;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2_CharOccurrances {

	public static void main(String[] args) {

		String input = "programming";
		
		Map<Character,Long> inputMap=input.chars()
				.mapToObj(ch -> (char)ch)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				;
System.out.println(inputMap);
		
	}

}

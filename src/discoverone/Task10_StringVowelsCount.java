package discoverone;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Task10_StringVowelsCount {

	public static void main(String[] args) {
		
		String str="Reach your goals cultivate self love and live life at its best";

		str.toLowerCase().chars()
		.mapToObj(ch ->(char)ch)
		.filter(ch -> String.valueOf(ch).matches("[aeiou]"))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.forEach(entry -> System.out.println(entry.getKey() +" - "+ entry.getValue()) );
	}

}

package discoverone;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Task4_FilterDuplicateChars {

	public static void main(String[] args) {

		String str="Auto-generated method stub";
		
		str.replace(" ", "").toLowerCase().chars()
		.mapToObj(ch -> (char) ch)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream()
		.filter(entry -> entry.getValue()>1)
		.forEach(entry -> System.out.println(entry.getKey()+" - "+ entry.getValue()));

	}

}

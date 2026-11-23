package sharayu;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Task4_FilterPallindroms {

	public static void main(String[] args) {
		
		String sentence = "madam teaches level civic duties at noon";
		
		List<String> words=Arrays.stream(sentence.split("\\s"))
				.filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
				.collect(Collectors.toList());
		
		System.out.println("Pallindrome - "+words);
		
				
		
		
	}

}

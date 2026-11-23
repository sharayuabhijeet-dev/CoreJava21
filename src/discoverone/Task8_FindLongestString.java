package discoverone;

import java.util.Arrays;
import java.util.Comparator;

public class Task8_FindLongestString {

	public static void main(String[] args) {
		String str="Reach your goals cultivate self love and live life at its best";
		
		String longest=Arrays.stream(str.split("\\s"))
				.max(Comparator.comparingInt(String::length))
				.orElse("");
		System.out.println("Longest string is "+longest);
		
	}

}

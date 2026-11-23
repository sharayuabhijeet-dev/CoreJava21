package discoverone;

import java.util.Arrays;
import java.util.Comparator;

public class Task8_FindLongestString {

	public static void main(String[] args) {
		String str="I am sharayu a Java Developer at IT org OpusTechGlobal";
		
		String longest=Arrays.stream(str.split("\\s"))
				.max(Comparator.comparingInt(String::length))
				.orElse("");
		System.out.println("Longest string is "+longest);
		
	}

}

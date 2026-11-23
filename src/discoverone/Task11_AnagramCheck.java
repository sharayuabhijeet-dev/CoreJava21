package discoverone;

import java.util.List;
import java.util.stream.Collectors;

public class Task11_AnagramCheck {

	public static void main(String[] args) {

		String str1="listen";
		String str2="SileNt";
		
		List<Character> list1=str1.toLowerCase().chars()
		.mapToObj(ch -> (char)ch)
		.sorted()
		.collect(Collectors.toList());
		
		List<Character> list2=str2.toLowerCase().chars()
		.mapToObj(ch -> (char)ch)
		.sorted()
		.collect(Collectors.toList());
		
		if(list1.equals(list2))
		System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
	}
}

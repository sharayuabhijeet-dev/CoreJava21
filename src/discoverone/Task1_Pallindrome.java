package discoverone;

import java.util.stream.IntStream;

public class Task1_Pallindrome {

	public static void main(String[] args) {

		String str="nayan";
		
		boolean pallindrom=IntStream.range(0, str.length()/2)
				.allMatch(i -> str.charAt(i)==str.charAt(str.length()-1-i));
		
		System.out.println(pallindrom ? str+" is pallindrome" : str+" is not pallindrome");

	}

}

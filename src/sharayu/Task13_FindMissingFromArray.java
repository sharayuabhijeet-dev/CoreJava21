package sharayu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task13_FindMissingFromArray {

	public static void main(String[] args) {

//		int[] arr={1, 0, -2, 2};
//		
//		int min=Arrays.stream(arr).min().getAsInt();
//		int max=Arrays.stream(arr).max().getAsInt();
//		
//		int actual=0;
//		int expected=0;
//		
//		for(int i=min;i<=max;i++)
//		expected+=i;
//				
//		for(int num:arr)
//		actual+=num;
//		
//		
//		int missing = expected-actual;
//		System.out.println(missing);
		
		
		// approach-2 find multiple missing elements
		// -4 -3 -2 -1 0 1 2 3 4 5 6 7
		// -4 -3  
		
		int[] numbers={1, 0, -2, 2,-4,5,7,3};
		int min=Arrays.stream(numbers).min().getAsInt();
		int max=Arrays.stream(numbers).max().getAsInt();
		
		System.out.println("Min - "+min+" Max - "+max);
		
		Set<Integer> intSet=new HashSet<Integer>();
		for(int i=0;i<numbers.length;i++)
		{
			intSet.add(numbers[i]);
		}
		
		System.out.println("Set Values - "+intSet.toString());
		
		List<Integer> missingNumbers=new ArrayList<Integer>();
		
		for(int i=min;i<=max;i++)
		{
			if(!intSet.contains(i))
			{
				missingNumbers.add(i);
			}
		}
		
		System.out.println("Missing numbers - "+missingNumbers.toString());
		
		
	}

}
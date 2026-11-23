package sharayu;

import java.util.concurrent.atomic.AtomicReference;

public class Task12_Highest3FromArray {

	public static void main(String[] args) {

//		int[] a = { 4, 7, 1, 2, 8, 9 };
//
//		int first = Integer.MIN_VALUE;
//		int second = Integer.MIN_VALUE;
//		int third = Integer.MIN_VALUE;
//
//		for (int number : a) {
//			if (number > first) {
//				third = second;
//				second = first;
//				first = number;
//			} else if (number > second) {
//				third = second;
//				second = number;
//			} else if (number > third) {
//				third = number;
//			}
//
//		}
//
//		System.out.println("Largest three numbers are: " + first + ", " + second + ", " + third);
		
		AtomicReference<String> str = new AtomicReference<>("Abhijeet");
		str.compareAndSet("Abhijeet", "Sharayu1");
		System.out.println(str);

	}

}

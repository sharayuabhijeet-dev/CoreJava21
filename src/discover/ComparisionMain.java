package discover;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisionMain {

	public static void main(String[] args) {

		Employee emp1=new Employee(1, "Tom", 37, new Address(12,"Mall Road"));
		Employee emp2=new Employee(2, "Jerry", 40, new Address(134,"Badnera Road"));
		Employee emp3=new Employee(3, "Garry", 34, new Address(234,"Ring Road"));
		Employee emp4=new Employee(4, "Henry", 63, new Address(34,"Akoli Road"));
		Employee emp5=new Employee(3, "Derik", 64, new Address(23,"Camp Road"));
		
		List<Employee> empList=new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		//System.out.println(empList);
		
		System.out.println("\n==============Age Comparision====================");
		Collections.sort(empList, new AgeComparator());System.out.println(empList);
		
		System.out.println("\n==============Pincode Comparision====================");
		Collections.sort(empList, new AddressComparator());System.out.println(empList);
		
		System.out.println("\n==============Name Comparision====================");
		Collections.sort(empList, new NameComparator());System.out.println(empList);
	}

}

package lambda.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class $1_First {
	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(
				new Person("praveen","rao",31),
				new Person("sara","van",22),
				new Person("yogesh","rao",30),
				new Person("dimitri","scala",29),
				new Person("chokkha","sahu",28)
				);
		
		
		//Step1: sort list by last name
		
		Collections.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastname().compareTo(o2.getLastname());
			}
		});
		
		//Step2: create a method that prints all elements in list
		
		printAll(person);

		
		//Step3: craete a method that prints all people that have last name beginning with r
		System.out.println("****************************************************************");
		System.out.println();
		printLastName(person);
	}

	
	
	private static void printLastName(List<Person> person) {
		for(Person p : person) {
			if(p.lastname.startsWith("R") || p.lastname.startsWith("r")) {
				System.out.println(p);
			}
		}
	}



	private static void printAll(List<Person> person) {
		for(Person p : person) {
			System.out.println(p);
		}
	}
}

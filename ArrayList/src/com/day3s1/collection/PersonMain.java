package com.day3s1.collection;

import java.util.TreeSet;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person(1,25,"Shruti",20000.00);
		Person person2 = new Person(2,20,"Prajakta",24500.00);
		Person person3 = new Person(3,32,"Bhumi",746400.00);
		Person person4 = new Person(4,45,"Vibhavari",34000.00);
		Person person5 = new Person(5,39,"Kaveri",26500.00);
		Person person6 = new Person(6,22,"Akash",243350.00);
		Person person7 = new Person(7,41,"Vijay",560000.00);
		Person person8 = new Person(8,27,"Vishal",60000.00);
		Person person9 = new Person(9,30,"Prachi",58000.00);
		
		TreeSet<Person> person = new TreeSet<>();
		
		person.add(person1);
		person.add(person2);
		person.add(person3);
		person.add(person4);
		person.add(person5);
		person.add(person6);
		person.add(person7);
		person.add(person8);
		person.add(person9);
		
		
		System.out.println("Person with age greater than 25: ");
		
		for(Person p: person) {
			if(p.getAge() > 25) {
				System.out.println(p);
			}
		}
		
		System.out.println("--------------------\n");
		System.out.println("Printing the id,age,name and salary of each person");
		for(Person p: person) {
			System.out.println(p);
		}
		
		System.out.println("--------------------\n");
		System.out.println("Printing names of person in uppercase");
		
		for(Person p: person) {
			System.out.println(p.getName().toUpperCase());
		}
		
		System.out.println("--------------------\n");
		System.out.println("Print the sum of all salaries");
		
		
		double totalSalary = person.stream().mapToDouble(Person::getSalary).sum();
		
			System.out.println("Sum of all salaries: " +totalSalary);
			
			
			System.out.println("--------------------\n");
			System.out.println("Print the first person whose name starts with V");
		
			for(Person p: person) {
				if(p.getName().startsWith("V")) {
					System.out.println("The first person whose name starts with V :" +p);
				}
			}
	}

}

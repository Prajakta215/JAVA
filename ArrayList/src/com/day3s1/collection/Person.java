package com.day3s1.collection;

import java.util.Objects;

public class Person implements Comparable<Person> {
		private int id;
		private int age;
		private String name;
		private double salary;
		
		
		public Person(int id, int age, String name, double salary) {
			super();
			this.id = id;
			this.age = age;
			this.name = name;
			this.salary = salary;
		}
		
		public int getId() {
			return id;
		}
		public int getAge() {
			return age;
		}
		public String getName() {
			return name;
		}
		public double getSalary() {
			return salary;
		}
		
		
		
		@Override
		public int hashCode() {
			return Objects.hash(age, id, name, salary);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			return age == other.age && id == other.id && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}
		
		@Override
		public String toString() {
			return "Person [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
		}
		
		@Override
		public int compareTo(Person other) {
			return Integer.compare(this.id, other.id);
		}
		
		
}

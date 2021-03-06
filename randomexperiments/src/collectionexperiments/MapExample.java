package collectionexperiments;

import java.util.*;

import randomexperiments.inheritance.Student;

public class MapExample {
	public static void main(String args[]) {
		Comparator<Integer>comparator=new KeyComparator();
		Map<Integer, Student> map = new TreeMap<>(comparator);
		Student st1 = new Student(1, "shivam", 21);
		map.put(3, new Student(3, "buratan", 21));
		map.put(1, st1);
		map.put(2, new Student(2, "bhuratan", 21));
		map.put(1, new Student(10, "harshil", 21));
		int count = map.size();
		System.out.println("count after adding=" + count);
		Student studentWithKey2 = map.get(2);
		System.out.println("student with key 2=" + studentWithKey2.getId() + " " + studentWithKey2.getName());
		Set<Integer> keys = map.keySet();
		// map.remove(2); // removing element by key
		System.out.println("displaying values below");
		for (Integer key : keys) {
			Student student = map.get(key);
			System.out.println(" key=" + key + " value= " + student.getId() + " " + student.getName());

		}
		System.out.println("looping on values");
		Collection<Student> values = map.values();
		for (Student student : values) {
			System.out.println(student.getId() + " " + student.getName());
		}


	}

}

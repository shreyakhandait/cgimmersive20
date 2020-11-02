package org.cap.apps.studentbootjparest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "students")
@Entity
public class Student {

	@GeneratedValue
	@Id
	private Integer id;
	
	private String firstName,lastName;
	
	private Integer age;


	public Student() {
		
	}
	
	public Student(String firstName, String lastName, Integer age){
		this.firstName =firstName;
		this.lastName=lastName;
		this.age=age;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
    public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		int hash=Objects.hashCode(id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student that = (Student) obj;
	    return this.id.equals(that.id);
	}
	
	
	
}

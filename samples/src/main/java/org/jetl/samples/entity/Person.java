package org.jetl.samples.entity;

public class Person {

	private int id;
	private int age;
	private String sex;
	private String name;
	private static int count;
	
	public Person(String name, String sex, int age) {
		id = ++count;
		this.age = age;
		this.sex = sex;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
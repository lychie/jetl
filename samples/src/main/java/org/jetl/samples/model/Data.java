package org.jetl.samples.model;

import java.util.List;
import java.util.ArrayList;
import org.jetl.samples.entity.Person;

public class Data {

	private static final List<Person> PERSONS = getPersonList();
	
	private Data() {}
	
	public static List<Person> getPersonList(int pageIndex, int pageSize) {
		List<Person> persons = new ArrayList<Person>();
		int startIndex = (pageIndex - 1) * pageSize;
		int endIndex = startIndex + pageSize;
		for(int i = startIndex; i < endIndex; i++)
			persons.add(PERSONS.get(i));
		return persons;
	}
	
	public static int size() {
		return PERSONS.size();
	}
	
	private static List<Person> getPersonList() {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("李文豪", "男", 20));
		persons.add(new Person("周校民", "男", 24));
		persons.add(new Person("吴嘉宁", "男", 27));
		persons.add(new Person("郑宇乐", "男", 24));
		persons.add(new Person("王世杰", "男", 27));
		persons.add(new Person("赵晓妍", "女", 20));
		persons.add(new Person("孙凯文", "男", 38));
		persons.add(new Person("孙舒然", "女", 20));
		persons.add(new Person("周子轩", "女", 38));
		persons.add(new Person("郑羽纯", "女", 24));
		persons.add(new Person("王雅琪", "女", 20));
		persons.add(new Person("陈子浩", "男", 40));
		persons.add(new Person("李佳文", "女", 20));
		persons.add(new Person("吴诗琪", "女", 24));
		persons.add(new Person("郑诗颖", "女", 38));
		persons.add(new Person("沈文锋", "男", 24));
		persons.add(new Person("韩泽宇", "男", 20));
		persons.add(new Person("杨雨涵", "女", 27));
		persons.add(new Person("秦诗媛", "女", 20));
		persons.add(new Person("张哲文", "男", 40));
		return persons;
	}
	
}
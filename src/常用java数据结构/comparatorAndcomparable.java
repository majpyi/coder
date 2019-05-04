package 常用java数据结构;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-04-09 10:10
 * @Description:
 **/
class Person implements Comparable<Person>{
	private int id;
	private String name;
	private int age;

	public Person(int id,String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return id - o.id;
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name + "  age: " + age;
	}

	public static void main(String[] args){
		List<Person> list = new ArrayList<>();
		list.add(new Person(3,"John",18));
		list.add(new Person(1,"Marry",21));
		list.add(new Person(2,"Tom",20));
		System.out.println("Before sort:");
		printList(list);
		//调用sort函数，并传入自定义Comparator
		Collections.sort(list,new MyComparator());
		System.out.println("After sort:");
		printList(list);
	}



	//自定义Comparator接口，并重写compare方法
	private static class MyComparator implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			return o2.id - o1.id;
		}
	}

	private static void printList(List<Person> list){
		for (Person p : list){
			System.out.print(p + " / ");
		}
		System.out.println();
	}
}


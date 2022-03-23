package com.stream.demo;

import main.java.com.stream.demo.SpringBootApplication;


@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		PersonWithLombok p1 = new PersonWithLombok();
		PersonWithLombok p2 = new PersonWithLombok();

		p1.setId(1);
		p2.setId(1);
		p1.setAge(33);
		p1.setName("burhan");
		p1.setNationality("english");

		p1.toString();
		p2.toString();

		System.out.println(p1.equals(p2));

		System.out.println(p1);
		System.out.println(p2);

		PersonData personData = new PersonData();

		//PersonWithLombok p3 = PersonWithLombok.builder().name("irem").build();
		//System.out.println(p3);

	}



}

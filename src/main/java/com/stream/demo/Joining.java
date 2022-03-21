package com.stream.demo;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static String namesToString(List<Person> people){
        return "Names:" + people.stream().map(Person::getName).collect(Collectors.joining(",")) + ".";
    }
}

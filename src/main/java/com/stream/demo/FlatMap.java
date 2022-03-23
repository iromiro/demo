package com.stream.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static List<String> transform(List<List<String>> collection){
        return collection.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }

    public static List<Customer> allCustomers() {
        return Stream.of(
                new Customer(111, "aaa", "aaa@gmail.com", Arrays.asList("111111", "2111111")),
                new Customer(222, "bbb", "bbb@gmail.com", Arrays.asList("222222", "3222222")),
                new Customer(333, "ccc", "ccc@gmail.com", Arrays.asList("333333", "4333333")),
                new Customer(444, "ddd", "ddd@gmail.com", Arrays.asList("444444", "5444444"))
        ).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<Customer> customers = FlatMap.allCustomers();


        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);

        List<List<String>> phoneNumbers = customers.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);

    }
}

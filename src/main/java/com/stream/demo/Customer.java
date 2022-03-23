package com.stream.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

}

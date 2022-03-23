package com.stream.demo;

import lombok.*;

@Getter
@Setter
@ToString(of = "name")//just includes name
//generate getter, setter for all variables of class
@EqualsAndHashCode(of = "id")
@NoArgsConstructor//generate class constructor has no parameters // causes error when final variable exists
//@AllArgsConstructor//generate class constructor that has all variables as
//@RequiredArgsConstructor//generate constructor includes final variable
//@Builder
public class PersonWithLombok {

    private int id;
    private String name;
    private int age;
    @Setter(AccessLevel.PROTECTED)
    private String nationality;
    //private final int tc;


}


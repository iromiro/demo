package com.stream.demo;

import java.util.List;
import java.util.stream.Collectors;

public class Challange {

    public static String getString(List<Integer> list){
        return list.stream().map(x -> {
            String s = "";
            if(x % 2 == 0){
                s = "e" + x;
            }
            else{
                s = "o" + x;
            }
            return s;
        }).collect(Collectors.joining(","));
    }
}

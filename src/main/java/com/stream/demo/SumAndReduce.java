package com.stream.demo;

import java.util.Arrays;
import java.util.List;

public class SumAndReduce {

    public static int calculate(List<Integer> numbers){
        return numbers.stream().reduce(Integer::sum).orElse(0);
    }
}

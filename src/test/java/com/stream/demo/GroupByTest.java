package com.stream.demo;

import org.junit.jupiter.api.Test;

import static com.stream.demo.GroupBy.groupByNationality;
import java.util.List;
import java.util.Map;

import  static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class GroupByTest {

     @Test
    public void groupByNationalityTest(){

        Person irem = new Person("İrem", 22, "Turkish");
        Person enes = new Person("Enes", 25, "Bulgarian");
        Person emre = new Person("Emre", 9, "Turkish");

        List<Person> kisiler = asList(irem, enes, emre);
        Map<String, List<Person>> memleket = groupByNationality(kisiler);
        assertThat(memleket.get("Bulgarian")).hasSameElementsAs(singletonList(enes));
        assertThat(memleket.get("Turkish")).hasSameElementsAs(asList(irem, emre));

    }
}
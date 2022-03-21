package com.stream.demo;

import org.junit.jupiter.api.Test;

import com.stream.demo.Joining;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JoiningTest {

    @Test
    public void namesToStringTest(){

        Person irem = new Person("İrem", 22, "Turkish");
        Person enes = new Person("Enes", 25, "Bulgarian");
        Person emre = new Person("Emre", 9, "Turkish");

        List<Person> kisiler = asList(irem, enes, emre);

        assertThat(Joining.namesToString(kisiler).equals("Names: İrem, Enes, Emre."));

    }

}
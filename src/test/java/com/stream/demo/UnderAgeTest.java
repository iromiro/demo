package com.stream.demo;

import org.junit.jupiter.api.Test;

import java.util.List;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UnderAgeTest {
    @Test
    public void getKidNameShouldReturnNamesOfAllKidsUnder18(){
        Person irem = new Person("İrem", 22);
        Person emre = new Person("Emre" , 9);
        Person sarp = new Person("Sarp", 7);
        Person enes = new Person("Enes", 25);

        List<Person> collection = asList(irem, emre, sarp, enes);
        assertThat(UnderAge.getKidNames(collection))
                .contains("Emre", "Sarp")
                .doesNotContain("Enes", "İrem");
    }

}
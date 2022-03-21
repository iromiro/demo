package com.stream.demo;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.stream.demo.PartitionBy.partitionAdults;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;


class PartitionByTest {

    @Test
    public void partitionAdultstest() {

        Person irem = new Person("İrem", 22);
        Person enes = new Person("Enes", 25);
        Person emre = new Person("Emre", 9);
        Person sarp = new Person("Sarp", 7);

        List<Person> kisiler = asList(irem, enes, emre, sarp);
        Map<Boolean, List<Person>> buyukler = partitionAdults(kisiler);
        assertThat(buyukler.get(true)).hasSameElementsAs(asList(irem, enes));
        assertThat(buyukler.get(false)).hasSameElementsAs(asList(emre, sarp));
    }



}
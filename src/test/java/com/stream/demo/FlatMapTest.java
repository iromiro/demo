package com.stream.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class FlatMapTest {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Enes", "Irem"), asList("Merve", "Emre"));
        List<String> expected = asList("Enes", "Irem", "Merve", "Emre");
        assertThat(FlatMap.transform(collection).containsAll(expected));
    }


}
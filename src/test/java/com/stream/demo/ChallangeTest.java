package com.stream.demo;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ChallangeTest {

    @Test
    public void getStringTest() {
        assertThat(Challange.getString(asList(2,5))).isEqualTo("e2,o5");
    }

}
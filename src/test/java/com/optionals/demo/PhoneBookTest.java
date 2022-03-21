package com.optionals.demo;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {


    private PhoneBook phoneBook = new PhoneBook();

    @Test
    public void findPhoneNumberByName() throws Exception{
        Optional<String> phoneNumber  = phoneBook.findPhoneNumberByName("irem");
        assertThat(phoneNumber.get()).isEqualTo("123456789");
    }


}
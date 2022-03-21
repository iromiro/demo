package com.optionals.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private static final HashMap<String, String> tel_no = new HashMap<String, String>() {
        {
            put("irem", "123456789");
            put("enes", "987654321");
            put("emre", "159357456");
        }
    };

    private HashMap<String, String> phoneBook = tel_no;

    PhoneBook () { }

    public HashMap<String, String> getPhoneBook () {
        return phoneBook;
    }

    public Optional<String> findPhoneNumberByName(String name){
        return Optional.of(tel_no.get(name));
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber){

        return tel_no.entrySet().stream().filter(entry -> entry.getValue().equals(phoneNumber))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    @Override
    public String toString(){
        return "PhoneBook{" + "phoneBookEntries = " + phoneBook + "}";
    }





}

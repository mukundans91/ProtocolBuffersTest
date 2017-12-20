package com.proto.service;

import com.proto.Person;

public class Test {
    public static void main(String[] args) {
        Person person = Person.newBuilder()
                .setEmail("test@test.com")
                .setName("testP")
                .setId(123)
                .build();

        System.out.printf("person " + person);
    }
}

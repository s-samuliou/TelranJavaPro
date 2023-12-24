package com.telran.org.twentytwo.example;

public class PersonConverter implements Converter<Person, PersonDto> {

    @Override
    public PersonDto toDto(Person person) {
        return null;
    }

    @Override
    public Person roObject(PersonDto personDto) {
        return null;
    }
}

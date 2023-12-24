package com.telran.org.twentytwo.example;

public interface Converter<Entity, Dto> {

    Dto toDto(Entity person);
    Entity roObject(Dto personDto);
}

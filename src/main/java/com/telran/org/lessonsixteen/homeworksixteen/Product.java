package com.telran.org.lessonsixteen.homeworksixteen;

import java.util.HashMap;
import java.util.Map;

public class Product {

    private int id;
    private String name;
    private Map<String, String> stringProperties;
    private Map<String, Integer> integerProperties;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.stringProperties = new HashMap<>();
        this.integerProperties = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getStringProperties() {
        return stringProperties;
    }

    public void setStringProperties(Map<String, String> stringProperties) {
        this.stringProperties = stringProperties;
    }

    public Map<String, Integer> getIntegerProperties() {
        return integerProperties;
    }

    public void setIntegerProperties(Map<String, Integer> integerProperties) {
        this.integerProperties = integerProperties;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stringProperties=" + stringProperties +
                ", integerProperties=" + integerProperties +
                '}';
    }

    public void addStringProperties(String category, String name) {
        stringProperties.put(category, name);
    }

    public void addIntegerProperties(String category, Integer value) {
        integerProperties.put(category, value);
    }
}

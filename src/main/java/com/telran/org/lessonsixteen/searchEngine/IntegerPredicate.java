package com.telran.org.lessonsixteen.searchEngine;

import java.util.function.Predicate;

public class IntegerPredicate implements Predicate<Product> {
    private int referenceValue;
    private IntegerOperator operator;
    private String propertyName;

    public IntegerPredicate(int referenceValue, IntegerOperator operator, String propertyName) {
        this.referenceValue = referenceValue;
        this.operator = operator;
        this.propertyName = propertyName;
    }

    @Override
    public boolean test(Product product) {
        return false;
    }

    public enum IntegerOperator {
        LESS_THAN,
        EQUAL,
        NOT_EQUAL,
        GREATER_THAN,
        LESS_OR_EQUAL_THAN;
    }
}

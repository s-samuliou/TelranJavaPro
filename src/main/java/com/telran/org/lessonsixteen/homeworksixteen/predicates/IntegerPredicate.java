package com.telran.org.lessonsixteen.homeworksixteen.predicates;

import com.telran.org.lessonsixteen.homeworksixteen.Product;
import com.telran.org.lessonsixteen.homeworksixteen.enums.IntegerOperator;

import java.util.Map;
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
        if (product == null) {
            return false;
        }

        Map<String, Integer> integerProperties = product.getIntegerProperties();

        if (integerProperties.containsKey(propertyName)) {
            int propertyValue = integerProperties.get(propertyName);

            switch (operator) {
                case LESS_THAN:
                    return propertyValue < referenceValue;
                case EQUAL:
                    return propertyValue == referenceValue;
                case NOT_EQUAL:
                    return propertyValue != referenceValue;
                case GREATER_THAN:
                    return propertyValue > referenceValue;
                case LESS_OR_EQUAL_THAN:
                    return propertyValue <= referenceValue;
                case GREATER_OR_EQUAL_THAN:
                    return propertyValue >= referenceValue;
                default:
                    return false; // В случае некорректного оператора
            }
        } else {
            return false;
        }
    }
}

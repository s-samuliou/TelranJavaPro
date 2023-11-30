package com.telran.org.lessonsixteen.homeworksixteen.predicates;

import com.telran.org.lessonsixteen.homeworksixteen.Product;
import com.telran.org.lessonsixteen.homeworksixteen.enums.StringOperator;

import java.util.Map;
import java.util.function.Predicate;

public class StringPredicate implements Predicate<Product> {

    private String referenceValue;
    private StringOperator operator;
    private String propertyName;

    public StringPredicate(String referenceValue, StringOperator operator, String propertyName) {
        this.referenceValue = referenceValue;
        this.operator = operator;
        this.propertyName = propertyName;
    }

    @Override
    public boolean test(Product product) {
        if (product == null) {
            return false;
        }

        Map<String, String> stringProperties = product.getStringProperties();

        if (stringProperties.containsKey(propertyName)) {
            String propertyValue = stringProperties.get(propertyName);

            switch (operator) {
                case EQUAL:
                    return propertyValue.equals(referenceValue);
                case NOT_EQUAL:
                    return !propertyValue.equals(referenceValue);
                default:
                    return false;            }
        } else {
            return false;
        }
    }
}

package com.telran.org.lessonsixteen.homeworksixteen;

import com.telran.org.lessonsixteen.homeworksixteen.enums.IntegerOperator;
import com.telran.org.lessonsixteen.homeworksixteen.enums.StringOperator;
import com.telran.org.lessonsixteen.homeworksixteen.initializer.Initializer;
import com.telran.org.lessonsixteen.homeworksixteen.predicates.IntegerPredicate;
import com.telran.org.lessonsixteen.homeworksixteen.predicates.StringPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Startup {

    public void start() {
        Initializer initializer = new Initializer();
        List<Product> products = initializer.initialize();

        IntegerPredicate predicate1 = new IntegerPredicate(350, IntegerOperator.GREATER_THAN, "Price");
        IntegerPredicate predicate2 = new IntegerPredicate(500, IntegerOperator.LESS_THAN, "Price");
        StringPredicate predicate3 = new StringPredicate("Yellow", StringOperator.EQUAL, "Colour");
        StringPredicate predicate4 = new StringPredicate("Apple", StringOperator.EQUAL, "Fruit");

        List<Product> filtered1 = sort(products, predicate1);
        List<Product> filtered2 = sort(products, predicate2);
        List<Product> filtered3 = sort(products, predicate3);
        List<Product> filtered4 = sort(products, predicate4);

        System.out.println("Filter Integer 1: " + filtered1);
        System.out.println("Filter Integer 2: " + filtered2 + "\n");
        System.out.println("Filter String 3: " + filtered3);
        System.out.println("Filter String 4: " + filtered4);
    }

    public List<Product> sort(List<Product> products, Predicate<Product> predicate) {
        List<Product> filteredProducts = new ArrayList<>();

        for (Product product : products) {
            if (predicate.test(product)) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }
}

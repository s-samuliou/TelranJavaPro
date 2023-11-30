package com.telran.org.lessonsixteen.homeworksixteen.initializer;

import com.telran.org.lessonsixteen.homeworksixteen.Product;

import java.util.ArrayList;
import java.util.List;

public class Initializer {
    public List<Product> initialize() {
        List<Product> productList = new ArrayList<>();

        Product product1 = new Product(1, "Product A");
        product1.addStringProperties("Colour", "Red");
        product1.addStringProperties("Fruit", "Apple");
        product1.addIntegerProperties("Price", 250);

        Product product2 = new Product(2, "Product B");
        product2.addStringProperties("Colour", "Yellow");
        product2.addStringProperties("Fruit", "Banana");
        product2.addIntegerProperties("Price", 600);

        Product product3 = new Product(3, "Product C");
        product3.addStringProperties("Colour", "Yellow");
        product3.addStringProperties("Fruit", "Lemon");
        product3.addIntegerProperties("Price", 450);

        Product product4 = new Product(4, "Product D");
        product4.addStringProperties("Colour", "Green");
        product4.addStringProperties("Fruit", "Kiwi");
        product4.addIntegerProperties("Price", 350);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        return productList;
    }
}

package patterns;

import javax.sound.sampled.Port;
import java.util.function.Supplier;

public class FactoryPattern {
    public static void main(String[] args) {

    }
}

class ProductFactory {

    static Supplier<Product> createProduct(String name) {
        return switch (name) {
            case "loan" -> Loan::new;
            case "stock" -> Stock::new;
            default -> throw new IllegalArgumentException("Product: " + name + " nt=ot found!");
        };

    }
}

class Product {

}

class Stock extends Product {

}

class Loan extends Product {

}

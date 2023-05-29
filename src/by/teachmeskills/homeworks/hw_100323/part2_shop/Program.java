package by.teachmeskills.homeworks.hw_100323.part2_shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Shop shop = new Shop();

        Product product1 = new Product(1, "Bread", 2);
        Product product2 = new Product(2, "Meat", 10);
        Product product3 = new Product(3, "Grape", 7);
        Product product4 = new Product(4, "Butter", 3);
        Product product5 = new Product(5, "Bananas", 4);

        try {
            shop.addProduct(product1);
            shop.addProduct(product2);
            shop.addProduct(product3);
            shop.addProduct(product4);
            shop.addProduct(product5);

        } catch (EntityAlreadyExistsException ex) {
            System.out.println(ex.getMessage());
        }

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Bread", 2));
        products.add(new Product(2, "Meat", 10));
        products.add(new Product(3, "Grape", 7));
        products.add(new Product(4, "Butter", 3));
        products.add(new Product(5, "Bananas", 4));

        products.sort(Comparator.comparingLong(Product::getPrice));
        System.out.println(products);

        try {
            shop.getAllProducts();
        } catch (EmptyProductListException e) {
            System.out.println(e.getMessage());
        }

        try {
            shop.deleteProduct(6);
        } catch (EntityNotFoundException | EmptyProductListException ee) {
            System.out.println(ee.getMessage());
        }

        try {
            shop.editProduct(1);
            product1.setName("Cabbage");
            product1.setPrice(6);
            System.out.println(product1);
        } catch (EntityNotFoundException | EmptyProductListException ent) {
            System.out.println(ent.getMessage());
        }
    }
}

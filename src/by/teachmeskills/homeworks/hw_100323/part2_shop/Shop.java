package by.teachmeskills.homeworks.hw_100323.part2_shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public Shop() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) throws EntityAlreadyExistsException {
        if (products.contains(product)) {
            throw new EntityAlreadyExistsException("Product with this id already exists");
        }
        products.add(product);
    }

    public List<Product> getAllProducts() throws EmptyProductListException {
        if (products.isEmpty()) {
            throw new EmptyProductListException("No products found");
        }
        return products;
    }

    public void deleteProduct(int id) throws EmptyProductListException, EntityNotFoundException {
        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
                return;
            }
        }
        for (Product p : products) {
            if (p.getId() != id) {
                throw new EntityNotFoundException("Product with this <id> not found");
            }
        }
        throw new EmptyProductListException("No products found");
    }

    public void editProduct(int id) throws EmptyProductListException, EntityNotFoundException {
        for (Product p : products) {
            if (p.getId() == id) {
                return;
            }
        }
        for (Product p : products) {
            if (p.getId() != id) {
                throw new EntityNotFoundException("Product with this <id> not found");
            }
        }
        throw new EmptyProductListException("No products found");
    }
}

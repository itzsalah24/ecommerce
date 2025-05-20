package pl.zedadra.productcatalog;

import java.util.List;

public interface ProductStorage {
    List<Product> allProducts() //TECH
    ;

    void save(Product newProduct);

    Product loadProductById(String productId);
}
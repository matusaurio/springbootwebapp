package ec.com.decision.services;

import ec.com.decision.models.Product;

/**
 * Created by desarrollo on 18/11/15.
 */
public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}

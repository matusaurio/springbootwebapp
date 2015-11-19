package ec.com.decision.services;

import ec.com.decision.models.Product;
import ec.com.decision.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by desarrollo on 18/11/15.
 */
@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    //List Products
    @Override
    public Iterable<Product> listAllProducts(){
        return productRepository.findAll();
    }

    //Read
    @Override
    public Product getProductById(Integer id){
        return productRepository.findOne(id);
    }

    //Create/Update
    @Override
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    //Delete
    @Override
    public void deleteProduct(Integer id){
        productRepository.delete(id);
    }
}

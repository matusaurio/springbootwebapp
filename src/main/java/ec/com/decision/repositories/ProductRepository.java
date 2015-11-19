package ec.com.decision.repositories;

import ec.com.decision.models.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by desarrollo on 17/11/15.
 */
public interface ProductRepository extends CrudRepository<Product, Integer>{
}

package vi.vn.springdemo.service;

import vi.vn.springdemo.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vi.vn.springdemo.repository.ProduictRepostitory;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProduictRepostitory repository;

    public List<Product> listALl() {
        return repository.findAll();
    }

    public void save(Product product) {
        repository.save(product);
    }

    public Product get(long id) {
        return repository.findById(id).get();
    }

    public void delete(long id){
        repository.deleteById(id);
    }

        public List<Product> listAll() {
        return repository.findAll();
    }
}

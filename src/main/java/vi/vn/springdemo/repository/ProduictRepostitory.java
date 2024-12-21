package vi.vn.springdemo.repository;
import vi.vn.springdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProduictRepostitory extends JpaRepository<Product, Long> {

}

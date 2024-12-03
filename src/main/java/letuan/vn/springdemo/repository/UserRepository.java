package letuan.vn.springdemo.repository;

import letuan.vn.springdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

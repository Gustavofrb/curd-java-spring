package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Gustavo.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

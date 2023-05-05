package Repository;

import Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Authorrepo  extends JpaRepository<Author,Long> {
}

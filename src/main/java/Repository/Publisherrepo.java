package Repository;

import Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Publisherrepo  extends JpaRepository<Publisher, Long> {
}

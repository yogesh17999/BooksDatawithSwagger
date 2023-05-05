package Repository;

import Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepo extends JpaRepository<Books, Long> {
    Books findByBookname(String bookName, String language);
}

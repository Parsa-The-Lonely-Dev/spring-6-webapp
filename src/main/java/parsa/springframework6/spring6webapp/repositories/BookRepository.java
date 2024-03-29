package parsa.springframework6.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import parsa.springframework6.spring6webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

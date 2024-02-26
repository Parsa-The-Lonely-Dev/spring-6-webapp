package parsa.springframework6.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import parsa.springframework6.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

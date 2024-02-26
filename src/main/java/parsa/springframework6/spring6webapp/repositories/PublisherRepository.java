package parsa.springframework6.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import parsa.springframework6.spring6webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

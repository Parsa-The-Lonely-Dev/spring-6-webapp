package parsa.springframework6.spring6webapp.services;

import parsa.springframework6.spring6webapp.domain.Author;

public interface AuthorService {
    
    Iterable<Author> findAll();
}

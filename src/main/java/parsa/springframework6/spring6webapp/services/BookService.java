package parsa.springframework6.spring6webapp.services;

import parsa.springframework6.spring6webapp.domain.Book;

public interface BookService{

    Iterable<Book> findAll();

}

package vitalii.rysich.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vitalii.rysich.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

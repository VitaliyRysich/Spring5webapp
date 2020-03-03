package vitalii.rysich.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vitalii.rysich.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

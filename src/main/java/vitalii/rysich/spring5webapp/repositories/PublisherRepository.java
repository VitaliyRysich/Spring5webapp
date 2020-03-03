package vitalii.rysich.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vitalii.rysich.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

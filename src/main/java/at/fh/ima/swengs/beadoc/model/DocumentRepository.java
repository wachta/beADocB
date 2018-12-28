package at.fh.ima.swengs.beadoc.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface DocumentRepository extends PagingAndSortingRepository<Document,Long>, JpaRepository<Document, Long>, CrudRepository<Document, Long> {

}

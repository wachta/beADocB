package at.fh.ima.swengs.beadoc.service;

import at.fh.ima.swengs.beadoc.model.Document;
import at.fh.ima.swengs.beadoc.model.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service()
public class DocumentService {

  @Autowired
  private DocumentRepository documentRepository;

  public Optional<Document> findById(long id) { return documentRepository.findById(id); }

  public Document save(Document entity) { return documentRepository.save(entity); }

  public Document getDocument(Long dto){
    if(dto!=null) {
      Document entity = documentRepository.findById(dto).get();
      return entity;
    }
    return null;
  }

}

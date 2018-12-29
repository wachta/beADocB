package at.fh.ima.swengs.beadoc.service;

import at.fh.ima.swengs.beadoc.model.Document;
import at.fh.ima.swengs.beadoc.model.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service()
public class DocumentService {

  @Autowired
  private DocumentRepository documentRepository;

  public Optional<Document> findById(long id) { return documentRepository.findById(id); }

  /*public byte[] getContent(String dto){
    int len = dto.length();
    byte[] data = new byte[len / 2];
    for (int i = 0; i < len; i += 2) {
      data[i / 2] = (byte) ((Character.digit(dto.charAt(i), 16) << 4)
        + Character.digit(dto.charAt(i+1), 16));
    }
    return data;
  }*/

  public Document save(Document entity) { return documentRepository.save(entity); }

}

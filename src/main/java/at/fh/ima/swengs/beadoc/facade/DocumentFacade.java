package at.fh.ima.swengs.beadoc.facade;

import at.fh.ima.swengs.beadoc.dto.DocumentDTO;
import at.fh.ima.swengs.beadoc.model.Document;
import at.fh.ima.swengs.beadoc.model.DocumentRepository;
import at.fh.ima.swengs.beadoc.service.DocumentService;
import at.fh.ima.swengs.beadoc.service.MedicineService;
import at.fh.ima.swengs.beadoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service()
@Transactional
public class DocumentFacade {

  @Autowired
  DocumentService documentService;

  @Autowired
  UserService userService;

  @Autowired
  MedicineService medicineService;

  void mapDtoToEntity(DocumentDTO dto, Document entity){

    entity.setName(dto.getName());
    entity.setDescription(dto.getDescription());
    entity.setFileName(dto.getFileName());
    //entity.setContent(documentService.getContent(dto.getContent()));
    entity.setContentType(dto.getContentType());
    entity.setCreated(dto.getCreated());
    entity.setUser(userService.getUser(dto.getUser()));
    entity.setMedicine(medicineService.getMedicine(dto.getMedicine()));
    entity.setUserPicture(dto.isUserPicture());
    entity.setUploadedBy(userService.getUser(dto.getUploadedBy()));

  }

  private void mapEntityToDto(Document entity, DocumentDTO dto){
    dto.setId(entity.getId());
    dto.setName(entity.getName());
    dto.setDescription(entity.getDescription());
    dto.setFileName(entity.getFileName());
    /*if(entity.getContent() != null) {
      dto.setContent();
    }*/
    dto.setContentType(entity.getContentType());
    dto.setCreated(entity.getCreated());
    if (entity.getUser() != null) {
      dto.setUser(entity.getUser().getId());
    }
    if (entity.getMedicine() != null) {
      //dto.setMedicine(entity.getMedicine().getId());
    }
    dto.setUserPicture(entity.isUserPicture());
    if (entity.getUploadedBy() != null) {
      dto.setUploadedBy(entity.getUploadedBy().getId());
    }
  }

  public DocumentDTO update(Long id, DocumentDTO dto) {
    Document entity = documentService.findById(id).get();
    mapDtoToEntity(dto, entity);
    mapEntityToDto(documentService.save(entity), dto);
    return dto;
  }

  public DocumentDTO create(DocumentDTO dto) {
    Document entity = new Document();
    mapDtoToEntity(dto, entity);
    mapEntityToDto(documentService.save(entity), dto);
    return dto;
  }

  public DocumentDTO getById(Long id) {
    Document entity = documentService.findById(id).get();
    DocumentDTO dto = new DocumentDTO();
    mapEntityToDto(entity, dto);
    return dto;
  }
}

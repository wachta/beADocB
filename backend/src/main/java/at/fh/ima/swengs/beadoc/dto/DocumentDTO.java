package at.fh.ima.swengs.beadoc.dto;

import java.util.Date;
import java.util.Set;

public class DocumentDTO {

  private long id;
  private String name;
  private String description;
  private String fileName;
  private String content;
  private String contentType;
  private Date created;
  private Long user;
  private Long medicine;
  private boolean userPicture;
  private Long uploadedBy;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Long getUser() {
    return user;
  }

  public void setUser(Long user) {
    this.user = user;
  }

  public Long getMedicine() {
    return medicine;
  }

  public void setMedicine(Long medicine) {
    this.medicine = medicine;
  }

  public boolean isUserPicture() {
    return userPicture;
  }

  public void setUserPicture(boolean userPicture) {
    this.userPicture = userPicture;
  }

  public Long getUploadedBy() {
    return uploadedBy;
  }

  public void setUploadedBy(Long uploadedBy) {
    this.uploadedBy = uploadedBy;
  }
}

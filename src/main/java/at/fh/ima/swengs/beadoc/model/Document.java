package at.fh.ima.swengs.beadoc.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class,
  property = "id")
public class Document {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String description;
  private String fileName;

  @Lob
  @Basic(fetch = FetchType.LAZY)
  private byte[] content;
  private String contentType;

  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date created;

  //wenn es kein ProfilBild ist => null
  @OneToOne(mappedBy = "profilePicture")
  private User user;

  //wenn es kein Verpackungsbild ist => null
  @OneToOne(mappedBy = "picture")
  private Medicine medicine;

  //bestimmt ob es ein ProfilBild, oder ein Verpackungsbild ist
  private boolean userPicture;

  // nur wenn es ein Foto einer Medizinverpackung ist, die ein Patient hochgeladen hat
  @ManyToOne
  private User uploadedBy;

  @Version
  @JsonIgnore
  private long version;

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

  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
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

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Medicine getMedicine() {
    return medicine;
  }

  public void setMedicine(Medicine medicine) {
    this.medicine = medicine;
  }

  public boolean isUserPicture() {
    return userPicture;
  }

  public void setUserPicture(boolean userPicture) {
    this.userPicture = userPicture;
  }

  public User getUploadedBy() {
    return uploadedBy;
  }

  public void setUploadedBy(User uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Document document = (Document) o;
    return id == document.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}

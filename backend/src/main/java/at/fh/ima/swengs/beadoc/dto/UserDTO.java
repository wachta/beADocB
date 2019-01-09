package at.fh.ima.swengs.beadoc.dto;

import at.fh.ima.swengs.beadoc.model.Gender;

import java.util.Date;
import java.util.Set;

public class UserDTO {

  private long id;
  private String name;
  private String lastName;
  private String username;
  private String password;
  private String eMail;
  private Date dayOfBirth;
  private Set<Long> appointments;
  private Set<Long> medicines;
  private Long profilePicture;
  private Set<Long> medicinePictures;
  private boolean admin;
  private boolean employee;
  private boolean active;
  private Gender gender;

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

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }

  public Date getDayOfBirth() {
    return dayOfBirth;
  }

  public void setDayOfBirth(Date dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }

  public Set<Long> getAppointments() {
    return appointments;
  }

  public void setAppointments(Set<Long> appointments) {
    this.appointments = appointments;
  }

  public Set<Long> getMedicines() {
    return medicines;
  }

  public void setMedicines(Set<Long> medicines) {
    this.medicines = medicines;
  }

  public Long getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(Long profilePicture) {
    this.profilePicture = profilePicture;
  }

  public Set<Long> getMedicinePictures() {
    return medicinePictures;
  }

  public void setMedicinePictures(Set<Long> medicinePictures) {
    this.medicinePictures = medicinePictures;
  }

  public boolean isAdmin() {
    return admin;
  }

  public void setAdmin(boolean admin) {
    this.admin = admin;
  }

  public boolean isEmployee() {
    return employee;
  }

  public void setEmployee(boolean employee) {
    this.employee = employee;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }
}

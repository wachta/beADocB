package at.fh.ima.swengs.beadoc.dto;


import at.fh.ima.swengs.beadoc.model.Gender;
import at.fh.ima.swengs.beadoc.model.Zodiac;

import java.util.Date;
import java.util.Set;

public class ActorDTO {

  private Long id;
  private String firstName;
  private String lastName;
  private boolean alive = true;
  private Integer rating;
  private Gender gender;
  private Date dayOfBirth;
  private Set<Long> movies;
  private Zodiac zodiac;
  private Long bloodType;
  private float heightInCm;

  public float getHeightInCm() {
    return heightInCm;
  }

  public void setHeightInCm(float heightInCm) {
    this.heightInCm = heightInCm;
  }

  public Long getBloodType() {
    return bloodType;
  }

  public void setBloodType(Long bloodType) {
    this.bloodType = bloodType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public boolean isAlive() {
    return alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Zodiac getZodiac() {
    return zodiac;
  }

  public void setZodiac(Zodiac zodiac) {
    this.zodiac = zodiac;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Date getDayOfBirth() {
    return dayOfBirth;
  }

  public void setDayOfBirth(Date dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }

  public Set<Long> getMovies() {
    return movies;
  }

  public void setMovies(Set<Long> movies) {
    this.movies = movies;
  }


}

package eu.sii.pl.sakilaapp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "actor")
public class Actor {

  @Column(name = "actor_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Short actorId;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "last_update")
  private LocalDateTime lastUpdate;

  public Actor() {
  }

  public Actor(String firstName, String lastName, LocalDateTime lastUpdate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.lastUpdate = lastUpdate;
  }

  public Short getActorId() {
    return actorId;
  }

  public Actor setActorId(Short actorId) {
    this.actorId = actorId;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public Actor setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public Actor setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public LocalDateTime getLastUpdate() {
    return lastUpdate;
  }

  public Actor setLastUpdate(LocalDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }
}
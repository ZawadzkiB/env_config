package eu.sii.pl.sakilaapp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "language")
public class Language {

  @Column(name = "language_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Byte languageId;
  @Column(name = "name", columnDefinition = "char(20)")
  private String name;
  @Column(name = "last_update")
  private LocalDateTime lastUpdate;

  public Language(){}

  public Language(String name, LocalDateTime lastUpdate) {
    this.name = name;
    this.lastUpdate = lastUpdate;
  }

  public Byte getLanguageId() {
    return languageId;
  }

  public Language setLanguageId(Byte languageId) {
    this.languageId = languageId;
    return this;
  }

  public String getName() {
    return name;
  }

  public Language setName(String name) {
    this.name = name;
    return this;
  }

  public LocalDateTime getLastUpdate() {
    return lastUpdate;
  }

  public Language setLastUpdate(LocalDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }
}

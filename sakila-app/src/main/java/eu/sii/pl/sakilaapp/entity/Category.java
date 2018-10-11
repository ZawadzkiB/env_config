package eu.sii.pl.sakilaapp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "category")
public class Category {

  @Column(name = "category_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Byte categoryId;
  @Column(name = "name")
  private String name;
  @Column(name = "last_update")
  private LocalDateTime lastUpdate;

  public Category(){}

  public Category(String name, LocalDateTime lastUpdate) {
    this.name = name;
    this.lastUpdate = lastUpdate;
  }

  public Byte getCategoryId() {
    return categoryId;
  }

  public Category setCategoryId(Byte categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  public String getName() {
    return name;
  }

  public Category setName(String name) {
    this.name = name;
    return this;
  }

  public LocalDateTime getLastUpdate() {
    return lastUpdate;
  }

  public Category setLastUpdate(LocalDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }
}

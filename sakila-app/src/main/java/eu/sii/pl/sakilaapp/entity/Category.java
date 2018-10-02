package eu.sii.pl.sakilaapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}

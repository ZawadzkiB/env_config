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
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  Short id;
  @Column(name = "name")
  String name;
  @Column(name = "last_update")
  LocalDateTime lastUpdate;


}

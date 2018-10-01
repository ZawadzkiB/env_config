package eu.sii.pl.sakilaapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "language")
public class Language {

  @Column(name = "language_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Byte languageId;
  @Column(name = "name", columnDefinition="char(20)")
  private String name;
  @Column(name = "last_update")
  private LocalDateTime lastUpdate;
}

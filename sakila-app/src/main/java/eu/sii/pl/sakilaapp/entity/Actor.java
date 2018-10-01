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
@Table(name = "actor")
public class Actor {

  @Column(name = "actor_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Short actorId;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "last_update")
  private LocalDateTime lastUpdate;

}

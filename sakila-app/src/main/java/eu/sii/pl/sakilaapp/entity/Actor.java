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

}
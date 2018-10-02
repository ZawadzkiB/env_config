package eu.sii.pl.sakilaapp.entity;

import eu.sii.pl.sakilaapp.converter.FeaturesConverter;
import eu.sii.pl.sakilaapp.converter.RatingConverter;
import eu.sii.pl.sakilaapp.enums.Features;
import eu.sii.pl.sakilaapp.enums.Rating;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "film")
public class Film {

  @Column(name = "film_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Short filmId;
  @Column(name = "title")
  private String title;
  @Column(name = "description", columnDefinition = "text")
  private String description;
  @Column(name = "release_year", columnDefinition = "year(4)")
  private Short releaseYear;
  @ManyToOne
  @JoinColumn(name = "language_Id")
  private Language languageId;
  @ManyToOne
  @JoinColumn(name = "original_language_id", referencedColumnName = "language_id")
  private Language originalLanguageId;
  @Column(name = "rental_duration")
  private Byte renatlDuration;
  @Column(name = "rental_rate")
  private BigDecimal rentalRate;
  @Column(name = "length")
  private Short length;
  @Column(name = "replacement_cost")
  private BigDecimal replacementCost;
  @Column(name = "rating", columnDefinition = "enum('G','PG','PG-13','R','NC-17)")
  @Convert(converter = RatingConverter.class)
  private Rating rating;
  @Column(name = "special_features", columnDefinition = "set('Trailers', 'Commentaries', 'Deleted Scenes', 'Behind the Scenes')")
  @Convert(converter = FeaturesConverter.class)
  private EnumSet<Features> specialFeatures;
  @Column(name = "last_update")
  private LocalDateTime lastUpdate;
  @ManyToMany
  @JoinTable(name = "film_category",
          joinColumns = @JoinColumn(name = "film_id"),
          inverseJoinColumns = @JoinColumn(name = "category_id")
  )
  private List<Category> categories;
  @ManyToMany
  @JoinTable(name = "film_actor",
          joinColumns = @JoinColumn(name = "film_id"),
          inverseJoinColumns = @JoinColumn(name = "actor_id")
  )
  private List<Actor> actors;
}


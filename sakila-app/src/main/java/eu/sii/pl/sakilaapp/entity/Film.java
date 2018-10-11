package eu.sii.pl.sakilaapp.entity;

import eu.sii.pl.sakilaapp.entity.converter.FeaturesConverter;
import eu.sii.pl.sakilaapp.entity.converter.RatingConverter;
import eu.sii.pl.sakilaapp.enums.Features;
import eu.sii.pl.sakilaapp.enums.Rating;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.List;

@Entity
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

  public Film() {
  }

  public Film(String title, String description, Short releaseYear, Language languageId, Language originalLanguageId, Byte renatlDuration, BigDecimal rentalRate, Short length, BigDecimal replacementCost, Rating rating, EnumSet<Features> specialFeatures, LocalDateTime lastUpdate, List<Category> categories, List<Actor> actors) {
    this.title = title;
    this.description = description;
    this.releaseYear = releaseYear;
    this.languageId = languageId;
    this.originalLanguageId = originalLanguageId;
    this.renatlDuration = renatlDuration;
    this.rentalRate = rentalRate;
    this.length = length;
    this.replacementCost = replacementCost;
    this.rating = rating;
    this.specialFeatures = specialFeatures;
    this.lastUpdate = lastUpdate;
    this.categories = categories;
    this.actors = actors;
  }

  public Short getFilmId() {
    return filmId;
  }

  public Film setFilmId(Short filmId) {
    this.filmId = filmId;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Film setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Film setDescription(String description) {
    this.description = description;
    return this;
  }

  public Short getReleaseYear() {
    return releaseYear;
  }

  public Film setReleaseYear(Short releaseYear) {
    this.releaseYear = releaseYear;
    return this;
  }

  public Language getLanguageId() {
    return languageId;
  }

  public Film setLanguageId(Language languageId) {
    this.languageId = languageId;
    return this;
  }

  public Language getOriginalLanguageId() {
    return originalLanguageId;
  }

  public Film setOriginalLanguageId(Language originalLanguageId) {
    this.originalLanguageId = originalLanguageId;
    return this;
  }

  public Byte getRenatlDuration() {
    return renatlDuration;
  }

  public Film setRenatlDuration(Byte renatlDuration) {
    this.renatlDuration = renatlDuration;
    return this;
  }

  public BigDecimal getRentalRate() {
    return rentalRate;
  }

  public Film setRentalRate(BigDecimal rentalRate) {
    this.rentalRate = rentalRate;
    return this;
  }

  public Short getLength() {
    return length;
  }

  public Film setLength(Short length) {
    this.length = length;
    return this;
  }

  public BigDecimal getReplacementCost() {
    return replacementCost;
  }

  public Film setReplacementCost(BigDecimal replacementCost) {
    this.replacementCost = replacementCost;
    return this;
  }

  public Rating getRating() {
    return rating;
  }

  public Film setRating(Rating rating) {
    this.rating = rating;
    return this;
  }

  public EnumSet<Features> getSpecialFeatures() {
    return specialFeatures;
  }

  public Film setSpecialFeatures(EnumSet<Features> specialFeatures) {
    this.specialFeatures = specialFeatures;
    return this;
  }

  public LocalDateTime getLastUpdate() {
    return lastUpdate;
  }

  public Film setLastUpdate(LocalDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  public List<Category> getCategories() {
    return categories;
  }

  public Film setCategories(List<Category> categories) {
    this.categories = categories;
    return this;
  }

  public List<Actor> getActors() {
    return actors;
  }

  public Film setActors(List<Actor> actors) {
    this.actors = actors;
    return this;
  }
}
package eu.sii.pl.sakilaapp.controller.response;

import eu.sii.pl.sakilaapp.entity.Actor;
import eu.sii.pl.sakilaapp.entity.Category;
import eu.sii.pl.sakilaapp.entity.Film;
import eu.sii.pl.sakilaapp.entity.Language;
import eu.sii.pl.sakilaapp.enums.Features;
import eu.sii.pl.sakilaapp.enums.Rating;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.List;

@Getter
@NoArgsConstructor
public class FilmResponse {

  private List<Actor> actors;
  private List<Category> categories;
  private Short id;
  private String title;
  private LocalDateTime lastUpdate;
  private EnumSet<Features> specialFeatures;
  private Rating rating;
  private BigDecimal replacementCost;
  private BigDecimal rentalRate;
  private Short length;
  private Byte rentalDuration;
  private Language originalLanguageId;
  private Language languageId;
  private Short releaseYear;
  private String description;

  public FilmResponse(Film film) {
    this.actors = film.getActors();
    this.categories = film.getCategories();
    this.id = film.getFilmId();
    this.title = film.getTitle();
    this.description = film.getDescription();
    this.releaseYear = film.getReleaseYear();
    this.languageId = film.getLanguageId();
    this.originalLanguageId = film.getOriginalLanguageId();
    this.rentalDuration = film.getRenatlDuration();
    this.rentalRate = film.getRentalRate();
    this.length = film.getLength();
    this.replacementCost = film.getReplacementCost();
    this.rating = film.getRating();
    this.specialFeatures = film.getSpecialFeatures();
    this.lastUpdate = film.getLastUpdate();
  }

}

package eu.sii.pl.sakilaapp.controller.response;

import eu.sii.pl.sakilaapp.entity.Actor;
import eu.sii.pl.sakilaapp.entity.Category;
import eu.sii.pl.sakilaapp.entity.Film;
import eu.sii.pl.sakilaapp.entity.Language;
import eu.sii.pl.sakilaapp.enums.Features;
import eu.sii.pl.sakilaapp.enums.Rating;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.List;

@ResponseStatus(HttpStatus.OK)
@Getter
public class FilmResponse {

  private final List<Actor> actors;
  private final List<Category> categories;
  private final Short id;
  private final String title;
  private final LocalDateTime lastUpdate;
  private final EnumSet<Features> specialFetures;
  private final Rating rating;
  private final BigDecimal replacementCost;
  private final BigDecimal rentalRate;
  private final Short length;
  private final Byte rentalDuration;
  private final Language originalLanguageId;
  private final Language languageId;
  private final Short releaseYear;
  private final String description;

  public FilmResponse(Film film){
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
    this.specialFetures = film.getSpecialFeatures();
    this.lastUpdate = film.getLastUpdate();
  }

}

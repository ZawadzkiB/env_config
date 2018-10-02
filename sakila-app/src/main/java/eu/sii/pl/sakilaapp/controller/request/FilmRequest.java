package eu.sii.pl.sakilaapp.controller.request;

import eu.sii.pl.sakilaapp.entity.Actor;
import eu.sii.pl.sakilaapp.entity.Category;
import eu.sii.pl.sakilaapp.entity.Film;
import eu.sii.pl.sakilaapp.entity.Language;
import eu.sii.pl.sakilaapp.enums.Features;
import eu.sii.pl.sakilaapp.enums.Rating;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.List;

@Data
public class FilmRequest {

  private final List<Actor> actors;
  private final List<Category> categories;
  private final Short id;
  private final String title;
  private final LocalDateTime lastUpdate;
  private final EnumSet<Features> specialFeatures;
  private final Rating rating;
  private final BigDecimal replacementCost;
  private final BigDecimal rentalRate;
  private final Short length;
  private final Byte rentalDuration;
  private final Language originalLanguageId;
  private final Language languageId;
  private final Short releaseYear;
  private final String description;


  public Film buildEntity(){
    Film film = new Film();
    film.setActors(actors);
    film.setCategories(categories);
    film.setDescription(description);
    film.setFilmId(id);
    film.setLanguageId(languageId);
    film.setLastUpdate(LocalDateTime.now());
    film.setLength(length);
    film.setOriginalLanguageId(originalLanguageId);
    film.setRating(rating);
    film.setReleaseYear(releaseYear);
    film.setRenatlDuration(rentalDuration);
    film.setRentalRate(rentalRate);
    film.setReplacementCost(replacementCost);
    film.setSpecialFeatures(specialFeatures);
    film.setTitle(title);
    return film;
  }
}

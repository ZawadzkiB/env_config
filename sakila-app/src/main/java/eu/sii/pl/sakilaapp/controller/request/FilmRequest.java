package eu.sii.pl.sakilaapp.controller.request;

import eu.sii.pl.sakilaapp.entity.Actor;
import eu.sii.pl.sakilaapp.entity.Category;
import eu.sii.pl.sakilaapp.entity.Film;
import eu.sii.pl.sakilaapp.entity.Language;
import eu.sii.pl.sakilaapp.enums.Features;
import eu.sii.pl.sakilaapp.enums.Rating;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.List;


public class FilmRequest {

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

  public FilmRequest(){
  }

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

package eu.sii.pl.sakilaapp.controller.response;

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

  public FilmResponse() {
  }

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

  public List<Actor> getActors() {
    return actors;
  }

  public FilmResponse setActors(List<Actor> actors) {
    this.actors = actors;
    return this;
  }

  public List<Category> getCategories() {
    return categories;
  }

  public FilmResponse setCategories(List<Category> categories) {
    this.categories = categories;
    return this;
  }

  public Short getId() {
    return id;
  }

  public FilmResponse setId(Short id) {
    this.id = id;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public FilmResponse setTitle(String title) {
    this.title = title;
    return this;
  }

  public LocalDateTime getLastUpdate() {
    return lastUpdate;
  }

  public FilmResponse setLastUpdate(LocalDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  public EnumSet<Features> getSpecialFeatures() {
    return specialFeatures;
  }

  public FilmResponse setSpecialFeatures(EnumSet<Features> specialFeatures) {
    this.specialFeatures = specialFeatures;
    return this;
  }

  public Rating getRating() {
    return rating;
  }

  public FilmResponse setRating(Rating rating) {
    this.rating = rating;
    return this;
  }

  public BigDecimal getReplacementCost() {
    return replacementCost;
  }

  public FilmResponse setReplacementCost(BigDecimal replacementCost) {
    this.replacementCost = replacementCost;
    return this;
  }

  public BigDecimal getRentalRate() {
    return rentalRate;
  }

  public FilmResponse setRentalRate(BigDecimal rentalRate) {
    this.rentalRate = rentalRate;
    return this;
  }

  public Short getLength() {
    return length;
  }

  public FilmResponse setLength(Short length) {
    this.length = length;
    return this;
  }

  public Byte getRentalDuration() {
    return rentalDuration;
  }

  public FilmResponse setRentalDuration(Byte rentalDuration) {
    this.rentalDuration = rentalDuration;
    return this;
  }

  public Language getOriginalLanguageId() {
    return originalLanguageId;
  }

  public FilmResponse setOriginalLanguageId(Language originalLanguageId) {
    this.originalLanguageId = originalLanguageId;
    return this;
  }

  public Language getLanguageId() {
    return languageId;
  }

  public FilmResponse setLanguageId(Language languageId) {
    this.languageId = languageId;
    return this;
  }

  public Short getReleaseYear() {
    return releaseYear;
  }

  public FilmResponse setReleaseYear(Short releaseYear) {
    this.releaseYear = releaseYear;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public FilmResponse setDescription(String description) {
    this.description = description;
    return this;
  }
}

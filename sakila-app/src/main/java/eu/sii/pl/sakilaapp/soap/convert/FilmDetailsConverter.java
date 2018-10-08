package eu.sii.pl.sakilaapp.soap.convert;

import eu.sii.pl.sakilaapp.controller.response.FilmResponse;
import eu.sii.pl.sakilaapp.soap.film.Actor;
import eu.sii.pl.sakilaapp.soap.film.Category;
import eu.sii.pl.sakilaapp.soap.film.FilmDetails;

import java.util.stream.Collectors;

public class FilmDetailsConverter {

  public FilmDetails convert(FilmResponse filmResponse) {
    FilmDetails filmDetails = new FilmDetails();
    filmDetails.setId(filmResponse.getId());
    filmDetails.setDescription(filmResponse.getDescription());
    filmDetails.setTitle(filmResponse.getTitle());
    filmDetails.setActors(filmResponse.getActors().stream().map(actorEntity -> {
      Actor actor = new Actor();
      actor.setId(actorEntity.getActorId());
      actor.setFirstName(actorEntity.getFirstName());
      actor.setLastName(actorEntity.getLastName());
      return actor;
    }).collect(Collectors.toList()));
    filmDetails.setCategory(filmResponse.getCategories().stream().map(categoryEntity -> {
      Category category = new Category();
      category.setId(categoryEntity.getCategoryId());
      category.setName(categoryEntity.getName());
      return category;
    }).collect(Collectors.toList()));
    filmDetails.setLength(filmResponse.getLength());
    filmDetails.setRating(filmResponse.getRating().name());
    filmDetails.setReleaseYear(filmResponse.getReleaseYear());
    filmDetails.setRentalRate(filmResponse.getRentalRate());
    filmDetails.setRentalDuration(filmResponse.getRentalDuration());
    filmDetails.setReplacementCost(filmResponse.getReplacementCost());
    return filmDetails;
  }
}

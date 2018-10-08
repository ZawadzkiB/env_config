package eu.sii.pl.sakilaapp.soap.convert;

import eu.sii.pl.sakilaapp.controller.response.FilmResponse;
import eu.sii.pl.sakilaapp.soap.film.FilmDetails;

public class FilmDetailsConverter {

  public FilmDetails convert(FilmResponse filmResponse) {
    FilmDetails filmDetails = new FilmDetails();
    filmDetails.setId(filmResponse.getId());
    filmDetails.setDescription(filmResponse.getDescription());
    filmDetails.setName(filmResponse.getTitle());
    return filmDetails;
  }
}

package eu.sii.pl.sakilaapp.controller.response;

import eu.sii.pl.sakilaapp.entity.Film;

public class FilmCreateResponse {

  private Short id;

  public FilmCreateResponse(){
  }

  public FilmCreateResponse(Film film) {
    this.id = film.getFilmId();
  }

  public Short getId() {
    return id;
  }
}

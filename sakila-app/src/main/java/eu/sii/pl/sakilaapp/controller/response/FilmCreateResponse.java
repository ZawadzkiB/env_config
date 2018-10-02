package eu.sii.pl.sakilaapp.controller.response;

import eu.sii.pl.sakilaapp.entity.Film;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CREATED)
public class FilmCreateResponse {

  private final Short id;

  public FilmCreateResponse(Film film){
    this.id = film.getFilmId();
  }

  public Short getId() {
    return id;
  }
}

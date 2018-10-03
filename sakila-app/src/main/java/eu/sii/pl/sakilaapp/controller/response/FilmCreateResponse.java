package eu.sii.pl.sakilaapp.controller.response;

import eu.sii.pl.sakilaapp.entity.Film;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FilmCreateResponse {

  private Short id;

  public FilmCreateResponse(Film film) {
    this.id = film.getFilmId();
  }

}

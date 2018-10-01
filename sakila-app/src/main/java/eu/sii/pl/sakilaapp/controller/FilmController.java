package eu.sii.pl.sakilaapp.controller;

import eu.sii.pl.sakilaapp.entity.Film;
import eu.sii.pl.sakilaapp.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping(path = "/film")
public class FilmController {

  @Autowired
  private FilmService filmService;

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<Film> getMovies() {
    return filmService.getAllFilms();
  }
}

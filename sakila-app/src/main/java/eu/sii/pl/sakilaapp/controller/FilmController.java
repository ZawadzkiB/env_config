package eu.sii.pl.sakilaapp.controller;

import eu.sii.pl.sakilaapp.controller.request.FilmRequest;
import eu.sii.pl.sakilaapp.controller.response.FilmCreateResponse;
import eu.sii.pl.sakilaapp.controller.response.FilmResponse;
import eu.sii.pl.sakilaapp.entity.Film;
import eu.sii.pl.sakilaapp.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/film")
public class FilmController {

  @Autowired
  private FilmService filmService;

  @RequestMapping(path = "", method = RequestMethod.GET)
  public Page<FilmResponse> getMovies(@RequestParam(defaultValue = "0") int page,
                                      @RequestParam(defaultValue = "10") int limit) {
    return filmService.getAllFilms(PageRequest.of(page, limit));
  }

  @RequestMapping(path = "/title/{title}", method = RequestMethod.GET)
  public List<FilmResponse> getMovieByTitleContains(@PathVariable String title) {
    return filmService.getFilmByTitleContains(title);
  }

  @RequestMapping(path = "/id/{id}", method = RequestMethod.GET)
  public FilmResponse getMovieById(@PathVariable Short id) {
    return filmService.getFilmById(id);
  }

  @RequestMapping(path = "", method = RequestMethod.POST)
  public FilmCreateResponse saveMovie(@RequestBody FilmRequest request) {
    return filmService.createFilm(request);
  }
}

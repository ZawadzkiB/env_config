package eu.sii.pl.sakilaapp.service;

import eu.sii.pl.sakilaapp.controller.request.FilmRequest;
import eu.sii.pl.sakilaapp.controller.response.FilmCreateResponse;
import eu.sii.pl.sakilaapp.controller.response.FilmResponse;
import eu.sii.pl.sakilaapp.exceptions.EntityNotFoundException;
import eu.sii.pl.sakilaapp.repository.FilmRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmService {

  private final FilmRepository filmRepository;

  public FilmService(FilmRepository filmRepository) {
    this.filmRepository = filmRepository;
  }

  public Page<FilmResponse> getAllFilms(PageRequest request) {
    return filmRepository.findAll(request).map(FilmResponse::new);
  }

  public FilmResponse getFilmById(Short id) {
    return new FilmResponse(filmRepository.findFilmByFilmId(id)
            .orElseThrow(() -> new EntityNotFoundException(String.format("Movie with id %s can't be found", id))));
  }

  @Transactional
  public List<FilmResponse> getFilmByTitleContains(String title) {
    return filmRepository.findFilmByTitleContains(title).map(FilmResponse::new).collect(Collectors.toList());
  }

  public FilmCreateResponse createFilm(FilmRequest film) {
    return new FilmCreateResponse(filmRepository.save(film.buildEntity()));
  }

}

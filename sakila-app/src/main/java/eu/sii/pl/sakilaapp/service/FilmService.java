package eu.sii.pl.sakilaapp.service;

import eu.sii.pl.sakilaapp.entity.Actor;
import eu.sii.pl.sakilaapp.entity.Category;
import eu.sii.pl.sakilaapp.entity.Film;
import eu.sii.pl.sakilaapp.entity.Language;
import eu.sii.pl.sakilaapp.repository.ActorRepository;
import eu.sii.pl.sakilaapp.repository.CategoryRepository;
import eu.sii.pl.sakilaapp.repository.FilmRepository;
import eu.sii.pl.sakilaapp.repository.LanguageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FilmService {

  private final CategoryRepository categoryRepository;
  private final ActorRepository actorRepository;
  private final LanguageRepository languageRepository;
  private final FilmRepository filmRepository;

  public FilmService(CategoryRepository categoryRepository,
                     ActorRepository actorRepository,
                     LanguageRepository languageRepository,
                     FilmRepository filmRepository) {
    this.categoryRepository = categoryRepository;
    this.actorRepository = actorRepository;
    this.languageRepository = languageRepository;
    this.filmRepository = filmRepository;
  }

  public List<Category> getAllCategories() {
    return categoryRepository.findAll();
  }

  public List<Language> getAllLanguages() {
    return languageRepository.findAll();
  }

  public List<Actor> getAllActors() {
    return actorRepository.findAll();
  }

  public List<Film> getAllFilms() {
    return filmRepository.findAll();
  }
}

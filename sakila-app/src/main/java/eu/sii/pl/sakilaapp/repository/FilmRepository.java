package eu.sii.pl.sakilaapp.repository;

import eu.sii.pl.sakilaapp.entity.Film;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film, Short> {

  @Override
  List<Film> findAll();
}

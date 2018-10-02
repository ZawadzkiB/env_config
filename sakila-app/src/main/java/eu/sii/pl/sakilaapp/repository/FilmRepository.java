package eu.sii.pl.sakilaapp.repository;

import eu.sii.pl.sakilaapp.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.stream.Stream;

public interface FilmRepository extends Repository<Film, Short>, JpaRepository<Film, Short> {

  Optional<Film> findFilmByFilmId(Short id);

  Stream<Film> findFilmByTitleContains(String title);

}

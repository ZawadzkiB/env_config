package eu.sii.pl.sakilaapp.repository;

import eu.sii.pl.sakilaapp.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language, Byte> {
  @Override
  List<Language> findAll();
}

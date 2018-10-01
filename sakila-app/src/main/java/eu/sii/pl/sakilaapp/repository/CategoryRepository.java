package eu.sii.pl.sakilaapp.repository;

import eu.sii.pl.sakilaapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Byte> {

  @Override
  List<Category> findAll();
}

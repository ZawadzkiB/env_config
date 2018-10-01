package eu.sii.pl.sakilaapp.repository;

import eu.sii.pl.sakilaapp.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor,Short> {

  @Override
  List<Actor> findAll();
}

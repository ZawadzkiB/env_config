package eu.sii.pl.sakilaapp.service;

import eu.sii.pl.sakilaapp.entity.Category;
import eu.sii.pl.sakilaapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

  private final CategoryRepository categoryRepository;

  @Autowired
  public CategoryService(CategoryRepository categoryRepository){
    this.categoryRepository = categoryRepository;
  }

  public List<Category> getAll(){
    return categoryRepository.findAll();
  }

}

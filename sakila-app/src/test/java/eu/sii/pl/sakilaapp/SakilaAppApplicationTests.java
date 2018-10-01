package eu.sii.pl.sakilaapp;

import eu.sii.pl.sakilaapp.service.FilmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SakilaAppApplicationTests {

	@Autowired
	FilmService filmService;

	@Test
	public void categoryTest() {
		filmService.getAllCategories().forEach(System.out::println);
		filmService.getAllActors().forEach(System.out::println);
		filmService.getAllLanguages().forEach(System.out::println);
		filmService.getAllFilms();
	}

}

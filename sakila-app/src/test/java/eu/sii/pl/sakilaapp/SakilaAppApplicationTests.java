package eu.sii.pl.sakilaapp;

import eu.sii.pl.sakilaapp.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SakilaAppApplicationTests {

	@Autowired
	CategoryService categoryService;

	@Test
	public void categoryTest() {
		categoryService.getAll();
	}

}

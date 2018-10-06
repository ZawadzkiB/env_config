package eu.sii.pl.sakilaapp.controller

import com.jayway.restassured.RestAssured
import eu.sii.pl.sakilaapp.controller.response.FilmCreateResponse
import eu.sii.pl.sakilaapp.controller.response.FilmResponse
import org.assertj.core.api.Assertions
import org.junit.ClassRule
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.testcontainers.containers.DockerComposeContainer
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class FilmControllerTests extends Specification {

    @ClassRule
    @Shared
    DockerComposeContainer compose =
            new DockerComposeContainer(
                    new File("src/test/resources/testcontainers/docker-compose-test.yml"))
                    .withExposedService("sakila-test-db", 3306)

    @Value('${local.server.port}')
    int port

    def setup() {
        RestAssured.port = port
    }

    def "getMovies should return 200"() {
        given:
        def given = RestAssured.given().basePath('/api/film')

        when:
        def response = given.get()

        then:
        response.statusCode() == 200
    }

    @Unroll
    def "getMovie by id should return 200 and movie with #movieId"() {
        given:
        def given = RestAssured.given().basePath('/api/film/id/{id}')
                .pathParam("id", movieId)

        when:
        def response = given.get()

        then:
        response.statusCode() == 200
        Assertions.assertThat(response.body().as(FilmResponse).id.toString()).isEqualTo(movieId)

        where:
        movieId << ['1', '2', '3']
    }

    @Unroll
    def "getMovie by title should return 200 and movie list with titles that contains #title"() {
        given:
        def given = RestAssured.given().basePath('/api/film/title/{title}')
                .pathParam("title", title)

        when:
        def response = given.get()

        then:
        response.statusCode() == 200
        response.body().as(List).collect { film -> film.title }.forEach {
            Assertions.assertThat(it.toString()).containsIgnoringCase(title)
        }

        where:
        title << ['acad', 'bo']
    }

    def "post film should return 201 and film id"() {
        given:
        def given = RestAssured.given().basePath('/api/film')
                .body(this.getClass().getResource("/data/filmRequest.json").text)
                .contentType("application/json")

        when:
        def response = given.post()

        then:
        response.statusCode() == 201
        response.body().as(FilmCreateResponse).id.toString()?.trim()
    }
}

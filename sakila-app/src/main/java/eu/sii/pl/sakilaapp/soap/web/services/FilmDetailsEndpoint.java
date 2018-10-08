package eu.sii.pl.sakilaapp.soap.web.services;

import eu.sii.pl.sakilaapp.service.FilmService;
import eu.sii.pl.sakilaapp.soap.convert.FilmDetailsConverter;
import eu.sii.pl.sakilaapp.soap.film.GetFilmDetailsResponse;
import eu.sii.pl.sakilaapp.soap.film.GetFilmRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Transactional
public class FilmDetailsEndpoint {

  private final FilmService filmService;

  @Autowired
  public FilmDetailsEndpoint(FilmService filmService){
    this.filmService = filmService;
  }

  @PayloadRoot(namespace = "http://soap.sakilaapp.pl.sii.eu/film", localPart = "GetFilmRequest")
  @ResponsePayload
  public GetFilmDetailsResponse processCourseDetailsRequest(@RequestPayload GetFilmRequest request) {
    GetFilmDetailsResponse response = new GetFilmDetailsResponse();
    response.setFilmDetails(
            new FilmDetailsConverter().convert(filmService.getFilmById(request.getId())));
    return response;
  }

}

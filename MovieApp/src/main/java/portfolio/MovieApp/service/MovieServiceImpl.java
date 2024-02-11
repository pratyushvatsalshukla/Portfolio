package portfolio.MovieApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import portfolio.MovieApp.entity.MovieNewsWrapper;
import portfolio.MovieApp.entity.Top250Movies;
import portfolio.MovieApp.entity.TopBoxOffice;
import portfolio.MovieApp.entity.UpcomingTVShows;

@Service
public class MovieServiceImpl implements MovieService{

    final String X_RAPIDAPI_KEY = "c1291b578fmsh967b05595501b61p16c23bjsnf291302d87a7";
    final String X_RAPIDAPI_HOST = "moviesverse1.p.rapidapi.com";
    final String URL_MOVIE_NEWS = "https://moviesverse1.p.rapidapi.com/get-movie-news" ;
    final String URL_TOP_BOX_OFFICE="https://moviesverse1.p.rapidapi.com/top-box-office" ;
    final String URL_TOP_250_MOVIES = "https://moviesverse1.p.rapidapi.com/top-250-movies" ;
    final String URL_UPCOMING_TV_SHOWS = "https://moviesverse1.p.rapidapi.com/upcoming-tv-shows" ;
    @Autowired
    RestTemplate  restTemplate = new RestTemplate() ;

    @Override
    public MovieNewsWrapper getMovieNews() {
        MovieNewsWrapper response = restTemplate.exchange(URL_MOVIE_NEWS, HttpMethod.GET, getEntity(), MovieNewsWrapper.class).getBody() ;
        return response ;
    }

    @Override
    public TopBoxOffice getTopBoxOffice() {
        TopBoxOffice response = restTemplate.exchange(URL_TOP_BOX_OFFICE, HttpMethod.GET, getEntity(), TopBoxOffice.class).getBody() ;
        System.out.println(response);
        return response;
    }

    @Override
    public Top250Movies getTop250Movies() {
        Top250Movies response = restTemplate.exchange(URL_TOP_250_MOVIES, HttpMethod.GET, getEntity(), Top250Movies.class).getBody() ;
        return response;
    }

    @Override
    public UpcomingTVShows getUpcomingTVShows() {
        UpcomingTVShows response = restTemplate.exchange(URL_UPCOMING_TV_SHOWS, HttpMethod.GET, getEntity(), UpcomingTVShows.class).getBody() ;
        return response;
    }

    public HttpEntity<?> getEntity(){
        HttpHeaders  headers = new HttpHeaders() ;
        headers.set("X-RapidAPI-Key", X_RAPIDAPI_KEY);
        headers.set("X-RapidAPI-Host", X_RAPIDAPI_HOST);
        headers.set("ACCEPT", MediaType.APPLICATION_JSON_VALUE) ;
        return new HttpEntity<>(headers) ;

    }

}

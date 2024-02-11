package portfolio.MovieApp.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import portfolio.MovieApp.entity.MovieNewsWrapper;
import portfolio.MovieApp.entity.Top250Movies;
import portfolio.MovieApp.entity.TopBoxOffice;
import portfolio.MovieApp.entity.UpcomingTVShows;
import portfolio.MovieApp.service.MovieServiceImpl;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieServiceImpl movieService ;

    @GetMapping("/news")
    public ResponseEntity<?> getMovieNews(){
        MovieNewsWrapper movieNewsWrapper = movieService.getMovieNews();
        if(Objects.nonNull(movieNewsWrapper)){
            return ResponseEntity.ok(movieNewsWrapper);
        }
        else{
            return new ResponseEntity<>("No Movies Found !!" , HttpStatus.NOT_FOUND) ;
        }
    }
    @GetMapping("/top-box-office")
    public ResponseEntity<?> getTopBoxOffice(){
        TopBoxOffice movies =  movieService.getTopBoxOffice() ;
        if(Objects.nonNull(movies) && !Objects.isNull(movies.getMovies())){
            return new ResponseEntity<>(movies, HttpStatus.FOUND) ;
        }
        else{
            return new ResponseEntity<>("No Movies Found !!", HttpStatus.NOT_FOUND) ;
        }
    }

    @GetMapping("/top-250-movies")
    public ResponseEntity<?> getTop250Movies(){
        Top250Movies movies =  movieService.getTop250Movies() ;
        if(Objects.nonNull(movies) && !Objects.isNull(movies.getMovies())){
            return new ResponseEntity<>(movies, HttpStatus.FOUND) ;
        }
        else{
            return new ResponseEntity<>("No Movie Found !!", HttpStatus.NOT_FOUND) ;
        }
    }

    @GetMapping("/upcoming-tv-shows")
    public ResponseEntity<?> getUpcomingTvShows() {
        UpcomingTVShows movies = movieService.getUpcomingTVShows();
        System.out.println(movies);
        if (Objects.nonNull(movies)) {
            return new ResponseEntity<>(movies, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>("No Shows Found !!", HttpStatus.NOT_FOUND);
        }
    }

}


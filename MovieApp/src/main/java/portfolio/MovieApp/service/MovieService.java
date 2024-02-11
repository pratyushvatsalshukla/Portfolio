package portfolio.MovieApp.service;

import portfolio.MovieApp.entity.MovieNewsWrapper;
import portfolio.MovieApp.entity.Top250Movies;
import portfolio.MovieApp.entity.TopBoxOffice;
import portfolio.MovieApp.entity.UpcomingMovies;
import portfolio.MovieApp.entity.UpcomingTVShows;

public interface MovieService {
    public MovieNewsWrapper getMovieNews() ;
    public TopBoxOffice getTopBoxOffice() ;
    public Top250Movies getTop250Movies() ;
    public UpcomingTVShows  getUpcomingTVShows() ;
    public UpcomingMovies  getUpcomingMovies() ;
//    public SearchMovies  searchMovies(String movieName) ;
}

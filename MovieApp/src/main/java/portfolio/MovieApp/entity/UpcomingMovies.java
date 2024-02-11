package portfolio.MovieApp.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.MovieApp.entityContainer.UpcomingMoviesContainer;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpcomingMovies {
    private List<UpcomingMoviesContainer> movies ;
}

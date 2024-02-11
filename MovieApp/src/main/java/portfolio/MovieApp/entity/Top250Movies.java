package portfolio.MovieApp.entity;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.MovieApp.entityContainer.MovieTop250;
import portfolio.MovieApp.entityContainer.Movies;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Top250Movies {
    List<MovieTop250> movies ;
}

package portfolio.MovieApp.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import portfolio.MovieApp.entityContainer.Movies;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TopBoxOffice {
    List<Movies> movies ;
}

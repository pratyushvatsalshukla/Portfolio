package portfolio.MovieApp.entityContainer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movies {

    private String title ;

    // Movie News
    private String posterImage ;
    private String weekendGross ;
    private String totalGross ;
    private String weeksReleased ;
    private String imdbRating ;

    // Top 250 movies
//    private String image ;
//    private String year ;
//    private String timeline ;
//    private String rating ;

}

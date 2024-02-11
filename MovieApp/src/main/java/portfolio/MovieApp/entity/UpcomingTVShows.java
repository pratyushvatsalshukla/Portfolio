package portfolio.MovieApp.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.MovieApp.entityContainer.TVShowDetail;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpcomingTVShows {
    private List<TVShowDetail> movies ;
//    private String date ;
//    private List<TVShowDetail> list ;
}

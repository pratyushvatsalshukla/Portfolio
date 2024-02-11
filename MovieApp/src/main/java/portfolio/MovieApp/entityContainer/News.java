package portfolio.MovieApp.entityContainer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class News {
    private String image ;
    private String title ;
    private String description ;
    private String date ;
    private String writer ;
    private String source ;
    private String sourceLink ;
}

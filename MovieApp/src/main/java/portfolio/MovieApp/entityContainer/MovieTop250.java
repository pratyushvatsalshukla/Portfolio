package portfolio.MovieApp.entityContainer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieTop250 {
    private String title ;
    private int year ;
    private String timeline ;
    private String rating ;
    private String image ;
}

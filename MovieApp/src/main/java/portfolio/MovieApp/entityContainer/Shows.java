package portfolio.MovieApp.entityContainer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shows {

    private String title ;
    private String image ;
    private List<String> categories ;
    private List<String> staring ;
}

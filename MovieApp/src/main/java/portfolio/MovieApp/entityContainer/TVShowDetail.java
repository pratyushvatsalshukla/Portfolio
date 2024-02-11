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
public class TVShowDetail {
    private String date;
    private List<Shows> list ;
}

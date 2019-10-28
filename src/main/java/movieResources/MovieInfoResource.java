package movieResources;
/*   RajUser created on 10/26/2019 
inside the package - resources  */

import model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

    @RequestMapping("/{movieID}")
    public Movie getMovieInfo(@PathVariable("movieID") String movieID)
    {
        if(movieID.equalsIgnoreCase("1"))
       return new Movie(movieID,"Krishna Movie Name");
        else if(movieID.equalsIgnoreCase("2"))
            return new Movie(movieID,"Rama Movie Name");
        else
            return new Movie(movieID,"Narasimha Movie Name");
    }
}

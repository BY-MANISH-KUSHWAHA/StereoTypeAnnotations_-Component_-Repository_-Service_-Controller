package Stereo.Type.Annotations.Controller.Service.Repository.stereotype;



import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringMovieRecommendation {

    private SpringMovieFilters filter;

    public SpringMovieRecommendation(){}


    public void setFilter(SpringMovieFilters filter) {
        this.filter = filter;
    }


    public SpringMovieRecommendation(SpringMovieFilters filter) {
        this.filter = filter;
    }


    public List<String> recommandMovie(String movie){
        // suppose based on rating all movies are sorted.
        return filter.getRecommandations();

    }


}

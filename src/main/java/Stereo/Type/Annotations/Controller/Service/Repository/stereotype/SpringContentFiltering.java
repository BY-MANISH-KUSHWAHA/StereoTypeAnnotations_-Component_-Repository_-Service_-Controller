package Stereo.Type.Annotations.Controller.Service.Repository.stereotype;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpringContentFiltering implements SpringMovieFilters {
    @Autowired
    private Movie movie;

    public SpringContentFiltering(){
        super();
    }

    public static String[] getSpecialRecommandations(String movie){
        return new String[]{"Avengers","Mrs. Marvel","Hulk","Back to the future","Final Destination","Iron Man","Love and Thunder","Spiderman",
                "Amazing Spiderman","Batman","Fast 5"};
    }

    @Override
    public List<String> getRecommandations() {
        List<String> arr = new ArrayList<>();
        for (String movie:
             SpringContentFiltering.getSpecialRecommandations(" ")) {
            arr.add(movie);
        }
        arr = arr.stream().filter(s -> s.length()<8).collect(Collectors.toList());
        return arr;
    }
}

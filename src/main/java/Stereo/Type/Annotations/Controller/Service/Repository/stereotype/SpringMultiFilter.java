package Stereo.Type.Annotations.Controller.Service.Repository.stereotype;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpringMultiFilter implements SpringMovieFilters {

    @Override
    public List<String> getRecommandations() {
        List<String> arr = new ArrayList<>();
        for (String movie:
                SpringContentFiltering.getSpecialRecommandations(" ")) {
            arr.add(movie);
        }
        arr = arr.stream().filter(s -> s.length()<10).collect(Collectors.toList());
        return arr;
    }
}

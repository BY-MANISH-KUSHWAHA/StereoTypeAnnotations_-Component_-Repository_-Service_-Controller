package Stereo.Type.Annotations.Controller.Service.Repository.stereotype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private int id;
    private String name;
    private String gender;
    private String director;

    public Movie(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDirector() {
        return director;
    }

    public double movieSimilarity(Movie m1, Movie m2){
        double similar = 0.0;
        return similar;
    }
}

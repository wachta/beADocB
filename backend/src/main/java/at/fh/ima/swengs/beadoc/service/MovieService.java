package at.fh.ima.swengs.beadoc.service;

import at.fh.ima.swengs.beadoc.model.Movie;
import at.fh.ima.swengs.beadoc.model.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service()
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Set<Movie> getMovies(Set<Long> dtos) {
        Set<Movie> entities = new HashSet<>();
        dtos.forEach((dto)->entities.add(movieRepository.findById(dto).get()));
        return entities;
    }

}

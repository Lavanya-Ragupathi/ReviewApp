package dev.Lava.MovieReviews;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Movies>> getAllMovies(){
        return new ResponseEntity<List<Movies>>(movieService.allMovies(), HttpStatus.OK);

    }
    @GetMapping("/{imdbId}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movies>>(movieService.SingleMovie(imdbId),HttpStatus.OK);

    }

}

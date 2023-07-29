package dev.Lava.MovieReviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Map;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> mp){
        return new ResponseEntity<Review>(reviewService.createReview(mp.get("reviewBody"),mp.get("imdbId")), HttpStatus.CREATED);
    }
}

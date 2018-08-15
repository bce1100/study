package com.hand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bce1100
 * @date 2018/8/15.
 */
@Component("movie")
public class SimpleMovieListener {
    @Autowired
    private MovieFinder movieFinder;

    //就算有autowired也还是加上吧
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
}

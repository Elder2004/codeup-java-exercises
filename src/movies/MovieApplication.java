package movies;

import util.Input;

import java.util.Arrays;
import java.util.Objects;

public class MovieApplication {

    public static void main(String[] args) {


        Movie[] allMovies = MoviesArray.findAll();
        String category = null;
        // This call prints the movies in the horror category
//        printMovies(movies, "horror");
//        printMovies(movies, "drama");
//        // This call prints all of the movies
//        System.out.println(movies, "");
//                public static void printMovies (Movie[] allMovies, String category){
//                    for (Movie movie : movies) {
//                        if (category.equalsIgnoreCase(movie.getCategory())) {
//                            System.out.println(movie.getName() + " -- " + movie.getCategory());
//                        }
//                    }
//                }
//
//
//
        for (Movie movie : allMovies) {
            if (Objects.equals(category, movie.getCategory(category))) {
                if (!movie.getCategory().equalsIgnoreCase(category)) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
        }
    }
}
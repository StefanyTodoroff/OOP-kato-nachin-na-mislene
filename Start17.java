package stefany;

import java.util.Arrays;
import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filmoteka filmoteka = new Filmoteka();
		filmoteka.name = "Hollywood";
		
		Actor vin = new Actor();
		vin.name = "Vin Diesel";
		Actor al = new Actor();
		al.name = "Al Pacino";
        Movie movie1 = new Movie();
		movie1.actor = vin;
		movie1.ISBN = "1234";
		Movie movie2 = new Movie();
		movie2.actor = al;
		movie2.ISBN = "5678";
		
		vin.movies = new ArrayList<Movie>(Arrays.asList(movie1));
		al.movies = new ArrayList<Movie>(Arrays.asList(movie2));
		
		filmoteka.movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2));
		System.out.println("Collection of: " + filmoteka.name);
		for ( Movie movie : filmoteka.movies) {
			System.out.println(movie.ISBN + " " + movie.actor.name);
		}
		
		

	}

}

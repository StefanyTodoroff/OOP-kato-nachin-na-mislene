package stefany;

import java.util.ArrayList;
import java.util.Arrays;


public class Movie {
	String ISBN;
	Actor actor;
	ArrayList<Part> parts;
	
	Movie() {
		
		parts = new ArrayList<Part> (Arrays.asList(
				new Part(1),
				new Part(2),
				new Part(3)));
	}

}

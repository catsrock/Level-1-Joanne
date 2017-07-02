import org.omg.Messaging.SyncScopeHelper;

public class Movie implements Comparable<Movie> {
 
	private String title;
	private int stars;
 
	public Movie(String title, int stars) {
		this.title = title;
		this.stars = stars;
	}
	
	public static void main(String[] args) {
	Movie up=new Movie("Up", 4);
	Movie toyStory=new Movie("toyStory", 5);
	Movie lion=new Movie("Lion", 5);
	Movie batman=new Movie("Batman", 2);
	Movie superman=new Movie("Superman", 5);
	Movie barbie=new Movie("Barbie", 0);
		up.getTicketPrice();
		NetflixQueue n=new NetflixQueue();
		n.addMovie(barbie);
		n.addMovie(superman);
		n.addMovie(batman);
		n.addMovie(lion);
		n.addMovie(toyStory);
		n.addMovie(up);
		n.printMovies();
		n.sortMoviesByRating();
		System.out.println("The best movie is " + n.getBestMovie());
		System.out.println("The second best movie is "+ n.getMovie(1));
	}
	
	
	public String getTitle() {
		return this.title;
	}
 
	public int getRating() {
		return this.stars;
	}
 
	public String toString() {
		return "\"" + title + "\" - " + stars + " stars";
	}
 
public String getTicketPrice() {
		if (this.stars > 2) {
			return "That will be $12 please.";
		} else if (this.title.contains("Twilight")) {
			return "This movie is so bad, we'll pay YOU to watch it!";
		} else {
			return "Don't waste your money on this horrible rubbish.";
		}
	}
 
 
	public int compareTo(Movie otherMovie) {
		int compareQuantity = otherMovie.getRating();
 
		// return this.stars - compareQuantity; //ascending order
		return compareQuantity - this.stars; // descending order
	}
}

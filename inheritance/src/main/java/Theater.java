import java.util.LinkedList;

public class Theater implements ReviewableThings {
    // Instance properties
    protected String name;
    protected LinkedList<String> currentlyShowingMovies;
    protected LinkedList<Review> reviews;

    // Constructor
    Theater(String name) {
        this.name = name;
        this.currentlyShowingMovies = new LinkedList<>();
        this.reviews = new LinkedList<>();
    }

    // Returns a string with this instance of the Theater's info
    public String toString() {
         String aboutTheater = "Theater: " + this.name + ", Movies: " + currentlyShowingMovies + "\n";
        for (Review review : this.reviews) {
            aboutTheater += "Review: " + review.toString() + "\n";
        }
        return aboutTheater;
    }

    // Adds a movie to this instance of the Theater's currentlyShowingMovies linked list
    public void addMovie(String movie) {
        currentlyShowingMovies.add(movie);
    }

    // Adds a movie to this instance of the Theater's currentlyShowingMovies linked list
    public void removeMovie(String movie) {
        currentlyShowingMovies.remove(movie);
    }

    // Adds a review to this instance of the Theater's reviews
    public void addReview(Review review) {
        reviews.add(review);
    }
}

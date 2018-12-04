public class Review {
    // Instance properties
    private String body;
    private int stars;
    private String author;

    // Constructor
    Review(String body, int stars, String author) {
        this.body = body;
        this.stars = stars;
        this.author = author;
    }

    // Returns a string with this instance of the Review's info
    public String toString() {
        return "Review: " + this.body + ", Star Rating: " + this.stars + ", Author: " + this.author;
    }

    // Gets this instance of Review's stars property
    public int getStars() {
        return this.stars;
    }
}

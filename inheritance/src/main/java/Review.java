public class Review {
    public static void main(String[] args) {
        Review review = new Review("yolo", 1000, "Evan");
        System.out.println(review);

        Review review2 = new Review("yolo", 1000, "Evan", "moo-v");
        System.out.println(review2);
    }

    // Instance properties
    private String body;
    private int stars;
    private String author;
    private String movie;

    // Constructor
    Review(String body, int stars, String author, String movie) {
        this.body = body;
        this.stars = stars;
        this.author = author;
        this.movie = movie;
    }

    // Method Overload Constructor
    Review(String body, int stars, String author) {
        this.body = body;
        this.stars = stars;
        this.author = author;
    }

    // Returns a string with this instance of the Review's info
    public String toString() {
        String reviewText = this.body + ", Star Rating: " + this.stars + ", Author: " + this.author;

        if (this.movie != null) {
            reviewText += ", Movie: " + this.movie;
        }
        return reviewText;
    }

    // Gets this instance of Review's stars property
    public int getStars() {
        return this.stars;
    }
}

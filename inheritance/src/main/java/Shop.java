import java.util.LinkedList;

public class Shop {
    // Instance properties
    private String name;
    private String description;
    private String price;
    protected LinkedList<Review> reviews;

    // Constructor
    Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new LinkedList();
    }

    // Returns a string with this instance of the Review's info
    public String toString() {
        String aboutShop = "Shop: " + this.name + ", Description: " + this.description + ", Price: " + this.price + "\n";
        for (Review review : reviews) {
            aboutShop += review.toString() + "\n";
        }
        return aboutShop;
    }

    // Adds a review to this instance of the Shop's reviews
    public void addReview(Review review) {
        reviews.add(review);
    }
}

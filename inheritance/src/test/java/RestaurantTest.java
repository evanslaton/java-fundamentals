/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    // Tests for Restaurant class
    @Test
    public void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("Outback Steakhouse", "$$");
        assertEquals("Should be - Name: Outback Steakhouse, Star Rating: No rating yet, Price Category: $$", "Name: Outback Steakhouse, Star Rating: No rating yet, Price Category: $$\n", restaurant.toString());

        restaurant.addReview(new Review("This place is GREAT!", 5, "Joseph Cotton"));
        assertEquals("Should be - Name: Outback Steakhouse, Star Rating: 5, Price Category: $$\nReview: This place is GREAT!, Star Rating: 5, Author: Joseph Cotton\n", "Name: Outback Steakhouse, Star Rating: 5, Price Category: $$\nReview: This place is GREAT!, Star Rating: 5, Author: Joseph Cotton\n", restaurant.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant restaurant = new Restaurant("Chili's","$$");
        restaurant.addReview(new Review("I always leave negative reviews no matter what", 2, "Lonely And Angry"));
        assertEquals("Should be 1", 1, restaurant.reviews.size());

        restaurant.addReview(new Review("I want my babyback babyback babyback ribs.", 4, "Barbi Q. Sawsuh"));
        assertEquals("Should be 2", 2, restaurant.reviews.size());

        restaurant.addReview(new Review("Never actually been there but I know I wouldn't like it", 1, "John Smith"));
        assertEquals("Should be 3", 3, restaurant.reviews.size());
    }

    @Test
    public void testUpdateRestaurantStars() {
        Restaurant restaurant = new Restaurant("Panera Bread", "$$");
        restaurant.updateRestaurantStars(5);
        assertEquals("Should be 5", 5, restaurant.rating);

        restaurant.updateRestaurantStars(1);
        assertEquals("Should be 3", 3, restaurant.rating);

        restaurant.updateRestaurantStars(1);
        assertEquals("Should be 2", 2, restaurant.rating);
    }


    // Tests for Review class
    @Test
    public void testReviewToString() {
        Review review = new Review("This place is great!", 5, "John Smith");
        assertEquals("Should be - Review: This place is great!, Star Rating: 5, Author: John Smith", "Review: This place is great!, Star Rating: 5, Author: John Smith", review.toString());
    }

    @Test
    public void testReviewGetStars() {
        Review review = new Review("This place is great!", 5, "John Smith");
        assertEquals("Should be 5", 5, review.getStars());
    }
}

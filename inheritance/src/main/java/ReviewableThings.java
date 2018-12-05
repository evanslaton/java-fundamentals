public interface ReviewableThings {
    // Restaurant, Shop and Theater all implement this interface
    String toString();
    void addReview(Review review);
}

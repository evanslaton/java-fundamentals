# Lab 06: Inheritance and Interfaces

## Architecture
|   Class    |                   Properties                     |                   Methods                  |
|------------|--------------------------------------------------|--------------------------------------------|
| Restaurant | name, rating, priceCategory, review, starRatings | toString, addReview, updateRestaurantStars |
|  Reviews   |               body, stars, author                |              toString, getStars            |

## Challenge
* Create a class to represent a Restaurant.
* Each Restaurant should have a name, a number of stars, and a price category.
* Implement a reasonable toString method for Restaurant.
* Create a class to represent a Review.
* Each Review should have a body, an author, and a number of stars.
* Implement a reasonable toString method for Review.
* Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant.
* When you associate a review with a restaurant, that restaurant’s star rating should change.
* Test

## Testing
Each method has test coverage and all test pass.
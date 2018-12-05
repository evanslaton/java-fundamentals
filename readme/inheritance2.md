# Lab 07: Inheritance, Interfaces, and Other Relationships

## Architecture
|   Class    |                   Properties                      |                   Methods                  |
|------------|---------------------------------------------------|--------------------------------------------|
| Restaurant | name, rating, priceCategory, reviews, starRatings | toString, addReview, updateRestaurantStars |
|    Shop    |        name, description, price, reviews          |              toString, addReview           |
|   Theater  |      name, currentlyShowingMovies, reviews        | toString, addReview, addMovie, removeMovie |
|   Review   |      body, stars, author, movie (optional)        |              toString, getStars            |

|     Interface    |       Methods       |   Class that implement    |
|------------------|---------------------|---------------------------|
| ReviewableThings | toString, addReview | Restaurant, Shop, Theater |

## Challenge
* reate a Shop class; a Shop should have a name, description, and number of dollar signs.
* Implement a reasonable toString method for Shops. Add tests for the basics of your Shop class.
* Ensure that your Shop class has an instance method to add a review about that shop.
* Create a Theater class; a Theater should have a name and all of the movies currently showing there.
* Write addMovie and removeMovie methods that allow the theater to update which movies are being shown.
* Implement a reasonable toString method for Theaters.
* Ensure that your Theater is just as reviewable as your Restaurant and your Shop.
* Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing. Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw.
* Test all methods

## Testing
Each method has test coverage and all test pass.
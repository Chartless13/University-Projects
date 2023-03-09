$(document).on('ready', function() {
  //This calls the website with the reviews in it and stores the data in a variable called promise.
  var promise = $.ajax('https://student.computing.edgehill.ac.uk/~walshd/cis1110api/product-reviews/bikeoil');

  promise.done(function(data) {
//Here an array is created with a size of 13, this is where the ratings will be put when proccessed.
    var rating_array = new Array(13);
    //This is a for loop that executes 13 times.
    for (var idx = 0; idx < 13; idx++) {
      //Depending on which loop it is changed what idx is equal to.
      //If idx equals 1 it will check if the second rating is equal to 1, 2, 3, 4, or 5.
      //Depending on which it is equal to it store the corresponding rating in stars into the rating_array.
      //This continues until all ratings are processed
      if  (data[idx].rating == "1") {
      rating_array[idx] = "<span class=original_star>*</span>**** ";
    } else if (data[idx].rating == "2") {
      rating_array[idx] = "<span class=original_star>**</span>***";
    } else if (data[idx].rating == "3") {
      rating_array[idx] = "<span class=original_star>***</span>**";
    } else if (data[idx].rating =="4") {
      rating_array[idx] = "<span class=original_star>****</span>*";
    } else {
      rating_array[idx] = "<span class=original_star>*****</span>";
    }
    }
    //This for loop places the first 5 ratings, nicknames,reviews and photo into the html.
    for(var idx = 0; idx < 5; idx++) {
    $('#product_reviews').append('<span class="single_review">' + '<img src="../robot-juice-images/reviewicon1.jpg" class="review_photo">' + '<p class="rating">' + rating_array[idx] + '</p>' + '<p class="nickname">' + data[idx].nickname + '</p>' + '<p class="review">' + data[idx].review + '</p>' + '</span>');
  }
  //This for loop puts the rest of the ratings, nicknames, reviews and photos into the html but with a class of hidden so they do not apear when the site is firt loaded.
  for(var idx = 5; idx < 13; idx++) {
  $('#product_reviews').append('<span class="hidden">' + '<img src="../robot-juice-images/reviewicon1.jpg" class="review_photo">' + '<p class="rating">' + rating_array[idx] + '</p>' + '<p class="nickname">' + data[idx].nickname + '</p>' + '<p class="review">' + data[idx].review + '</p>' + '</span>');
  }
});

  //This JS block of code is for when the all reviews button is clicked
  $('#all_review_button').on('click', function(event) {
  event.preventDefault();
  //All the variables are for navigating the DOM so classes can be added or removed.
  var button = $(this);
  var main_container = button.parent().parent();
  var less_reviews_container1 = main_container.find('.less_reviews_container');
  var less_reviews_button = less_reviews_container1.find('.hidden')
  var review_container = main_container.find('.reviews_container');
  var single = review_container.find('.hidden');
  //Here classes are added and removed to make the all reviews button be hidden and the less reviews button appear aswell as the rest of the reviews.
  $(single).addClass('single_review');
  $(single).addClass('remove_me');
  $(single).removeClass('hidden');
  $(this).addClass('hidden');
  $(less_reviews_button).addClass('less_reviews');
  $(less_reviews_button).removeClass('hidden');
});

  //This JS block of code is for when the less reviews button is clicked
  $('#less_review_button').on('click', function(event) {
  event.preventDefault();
  //All the variables are for navigating the DOM so classes can be added or removed.
  var button = $(this);
  var main_container = button.parent().parent();
  var all_reviews_container1 = main_container.find('.all_reviews_container');
  var all_reviews_button = all_reviews_container1.find('.all_reviews');
  var review_container = main_container.find('.reviews_container');
  var single = review_container.find('.remove_me');
  //Here classes are added and removed to make the all reviews button be visible and the less reviews button hidden aswell as the all but 5 reviews.
  $(single).removeClass('single_review');
  $(single).addClass('hidden');
  $(all_reviews_button).removeClass('hidden');
  $(this).addClass('hidden');

});

 //checks if all the Javascript has loaded
  $('#status').html('Finished loading');
});

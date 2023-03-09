$(document).on('ready', function() {
  //Variables that change based on which button is clicked.
  var yes_counter = 16;
  var no_counter = 2;
  //This is for if the yes button is clicked.
  $('button.click').on('click', function(event) {
    event.preventDefault();
    //Clicked fills the button black
    $(this).addClass('clicked');
    //This removes the clicked class from the other bottom if it was clicked first.
    $(this).parent().find('button.click2').removeClass('clicked');
    yes_counter = yes_counter + 1;
    //This add text to the button to show how many people clicked each option
    $('p.buttontext1').append(" was chosen by " + yes_counter + " people");
    $('p.buttontext2').append(" was chosen by " + no_counter + " people");
  });
  //This is for if the no button is clicked.
  $('button.click2').on('click', function(event) {
    event.preventDefault();
    //Clicked fills the button black
    $(this).addClass('clicked');
    //This removes the clicked class from the other bottom if it was clicked first.
    $(this).parent().find('button.click').removeClass('clicked');
    no_counter = no_counter + 1;
    //This add text to the button to show how many people clicked each option
    $('p.buttontext1').append(" was chosen by " + yes_counter + " people");
    $('p.buttontext2').append(" was chosen by " + no_counter + " people");
  });
  //This shows if all the JS has loaded.
  $('#status').html('Finished loading');
});

<!DOCTYPE html>
<html lang="en">

<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<head> <!-- header begins here -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <link href="https://fonts.googleapis.com/css2?family=Roboto+Slab&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head> <!-- header ends here -->

<body> <!-- body begins here -->
  <div class = "jumbotron" style="text-align: center;">
    <h2>Please complete by entering your information</h2> <br>
  </div>
  <form action="/registration-confirmation" style="text-align: center;">

    <label for="fname">First name:</label>
    <input type="text" id="fname" name="fname"><br><br>
    <label for="lname">Last name:</label>
    <input type="text" id="lname" name="lname"><br><br>
    <label for="email">Email:</label>
    <input type="text" id="email" name="lname"><br><br>
    <label for="work_out_Experince">Work out Experice:</label>
    <input type="radio" name="work_out_Experince" id="None"> None
    <input type="radio" name="work_out_Experince" id="Casual"> Casual
    <input type="radio" name="work_out_Experince" id="Intermediate"> Intermeidate
    <input type="radio" name="work_out_Experince" id="Expert"> Expert
    <br>

    <label for="Workout_Focus"> Where do you want to focus</label>
    <select name="Workout" id="Workout">
      <option value="Cardio">Endurance</option>
      <option value="Strength">Strength</option>
      <option value="Weight_Loss">Weight Loss</option>
      <option value="Other">Other</option>
    </select>
    <br>
    <br>
    <input type="submit" value="Submit">
  </form>

</body>
</html>
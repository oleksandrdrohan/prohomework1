<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<h2>Two important questions:</h2>
<form action="question" method="post">
    <fieldset>
        <legend>What food do you like to eat ?</legend>
        <label for="food-meat">
            <input type="radio" id="food-meat" name="food" value="meat" required> Meat
        </label>
        <br>
        <label for="food-veggies">
            <input type="radio" id="food-veggies" name="food" value="veggies" required> Veggies
        </label>
    </fieldset>
    <fieldset>
        <legend>Which animals do you prefer ?</legend>
        <label for="animal-cat">
            <input type="radio" id="animal-cat" name="animal" value="cat" required> Cat
        </label>
        <br>
        <label for="animal-dog">
            <input type="radio" id="animal-dog" name="animal" value="dog" required> Dog
        </label>
    </fieldset>
    <br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
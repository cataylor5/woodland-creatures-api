<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create New Animal</title>
</head>
<body>
<h1>Create a New Woodland Creature</h1>

<form action="/woodlandcreatures/new" method="post">
    <label>Description:</label><br>
    <input type="text" name="wcdescription" required><br><br>

    <label>Species:</label><br>
    <input type="text" name="wcspecies" required><br><br>

    <label>SubSpecies:</label><br>
    <input type="text" name="wcsub_species"><br><br>

    <label>Height (meters):</label><br>
    <input type="number" step="0.01" name="wcheight" required><br><br>

    <label>Weight (kg):</label><br>
    <input type="number" step="0.01" name="wcweight" required><br><br>

    <label>Location:</label><br>
    <input type="text" name="woodland_creature_location" required><br><br>

    <label>Life Expectancy (years):</label><br>
    <input type="number" step="0.1" name="wclife_expectancy" required><br><br>

    <button type="submit">Save Animal</button>
</form>

<br>
<a href="/woodlandcreatures/all">⬅ Back to Animal List</a>

</body>
</html>

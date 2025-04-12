<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Animal</title>
</head>
<body>
<h1>Update Woodland Creature</h1>

<form action="/woodlandcreatures/update/${creature.woodlandcreatureid}" method="post">
    <label>ID (cannot change):</label><br>
    <input type="text" name="woodlandcreatureid" value="${creature.woodlandcreatureid}" readonly><br><br>

    <label>Description:</label><br>
    <input type="text" name="wcdescription" value="${creature.wcdescription}" required><br><br>

    <label>Species:</label><br>
    <input type="text" name="wcspecies" value="${creature.wcspecies}" required><br><br>

    <label>SubSpecies:</label><br>
    <input type="text" name="wcsub_species" value="${creature.wcsub_species}"><br><br>

    <label>Height (meters):</label><br>
    <input type="number" step="0.01" name="wcheight" value="${creature.wcheight}" required><br><br>

    <label>Weight (kg):</label><br>
    <input type="number" step="0.01" name="wcweight" value="${creature.wcweight}" required><br><br>

    <label>Location:</label><br>
    <input type="text" name="woodland_creature_location" value="${creature.woodland_creature_location}" required><br><br>

    <label>Life Expectancy (years):</label><br>
    <input type="number" step="0.1" name="wclife_expectancy" value="${creature.wclife_expectancy}" required><br><br>

    <button type="submit">Update Animal</button>
</form>

<br>
<a href="/woodlandcreatures/all">⬅ Back to Animal List</a>

</body>
</html>

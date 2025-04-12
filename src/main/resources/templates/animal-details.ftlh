<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Animal Details</title>
</head>
<body>
<h1>Animal Details</h1>

<h2>${creature.wcspecies} - ${creature.wcsub_species}</h2>

<p><strong>Description:</strong> ${creature.wcdescription}</p>
<p><strong>Height:</strong> ${creature.wcheight} meters</p>
<p><strong>Weight:</strong> ${creature.wcweight} kg</p>
<p><strong>Location:</strong> ${creature.woodland_creature_location}</p>
<p><strong>Life Expectancy:</strong> ${creature.wclife_expectancy} years</p>

<hr>

<a href="/woodlandcreatures/all">← Back to All Animals</a> |
<a href="/woodlandcreatures/update/${creature.woodlandcreatureid}">Edit</a> |
<a href="/woodlandcreatures/delete/${creature.woodlandcreatureid}">Delete</a>

</body>
</html>

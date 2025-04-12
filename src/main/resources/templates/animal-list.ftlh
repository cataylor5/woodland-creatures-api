<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Animal List</title>
</head>
<body>
<h1>All Woodland Creatures</h1>

<a href="/woodlandcreatures/createForm">➕ Create New Animal</a>

<table border="1" cellpadding="8">
    <thead>
    <tr>
        <th>ID</th>
        <th>Species</th>
        <th>SubSpecies</th>
        <th>Description</th>
        <th>Location</th>
        <th>Height (m)</th>
        <th>Weight (kg)</th>
        <th>Life Expectancy (years)</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <#list creatureList as creature>
    <tr>
        <td>${creature.woodlandcreatureid}</td>
        <td><a href="/woodlandcreatures/${creature.woodlandcreatureid}">${creature.wcspecies}</a></td>
        <td>${creature.wcsub_species}</td>
        <td>${creature.wcdescription}</td>
        <td>${creature.woodland_creature_location}</td>
        <td>${creature.wcheight}</td>
        <td>${creature.wcweight}</td>
        <td>${creature.wclife_expectancy}</td>
        <td>
            <a href="/woodlandcreatures/${creature.woodlandcreatureid}">View</a> |
            <a href="/woodlandcreatures/update/${creature.woodlandcreatureid}">Edit</a> |
            <a href="/woodlandcreatures/delete/${creature.woodlandcreatureid}">Delete</a>
        </td>
    </tr>
    </#list>
    </tbody>
</table>

</body>
</html>

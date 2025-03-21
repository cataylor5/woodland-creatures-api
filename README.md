# Woodland Creatures API

Base URL: `http://localhost:8080/woodlandcreatures`

---

### **/all** (GET)  
Returns a list of all woodland creatures in the database.

**Response – A JSON array of WoodlandCreature objects**  
```json
[
  {
    "woodlandCreatureID": 1,
    "wCDescription": "A medium-sized wild cat with tufted ears.",
    "wCSpecies": "Lynx",
    "wCSubSpecies": "Eurasian Lynx",
    "wCHeight": 2.1,
    "wCWeight": 25.0,
    "woodlandCreatureLocation": "Forests and mountains",
    "wCLifeExpectancy": 15.0
  },
  ...
]
```

---

### **/{creatureId}** (GET)  
Gets an individual woodland creature by ID.

**Parameters**  
- Path Variable: `creatureId` `<integer>` — **REQUIRED**

**Response – A single WoodlandCreature**  
```json
{
  "woodlandCreatureID": 1,
  "wCDescription": "A medium-sized wild cat with tufted ears.",
  "wCSpecies": "Lynx",
  "wCSubSpecies": "Eurasian Lynx",
  "wCHeight": 2.1,
  "wCWeight": 25.0,
  "woodlandCreatureLocation": "Forests and mountains",
  "wCLifeExpectancy": 15.0
}
```

---

### **/description** (GET)  
Finds creatures whose description contains a given search keyword.

**Parameters**  
- Query parameter: `search` `<string>` — **REQUIRED**

**Response – A list of WoodlandCreature objects**  
```json
[
  {
    "woodlandCreatureID": 2,
    "wCDescription": "A bird of prey known for its sharp talons.",
    ...
  }
]
```

---

### **/species/{species}** (GET)  
Finds all creatures matching a given species.

**Parameters**  
- Path Variable: `species` `<string>` — **REQUIRED**

**Response – A list of WoodlandCreature objects**  
```json
[
  {
    "woodlandCreatureID": 3,
    "wCSpecies": "Fox",
    ...
  }
]
```

---

### **/tall** (GET)  
Finds all creatures taller than a specified height.

**Parameters**  
- Query parameter: `height` `<double>` — **REQUIRED**

**Response – A list of WoodlandCreature objects**  
```json
[
  {
    "woodlandCreatureID": 4,
    "wCHeight": 2.5,
    ...
  }
]
```

---

### **/new** (POST)  
Adds a new creature to the database.

**Request Body – JSON**
```json
{
  "wCDescription": "A stealthy forest predator.",
  "wCSpecies": "Fox",
  "wCSubSpecies": "Red Fox",
  "wCHeight": 1.2,
  "wCWeight": 8.0,
  "woodlandCreatureLocation": "Northern woods",
  "wCLifeExpectancy": 14.0
}
```

**Response – the added WoodlandCreature**
```json
{
  "woodlandCreatureID": 26,
  "wCDescription": "A stealthy forest predator.",
  ...
}
```

---

### **/update/{creatureId}** (POST or PUT)  
Updates an existing creature.

**Parameters**  
- Path Variable: `creatureId` `<integer>` — **REQUIRED**

**Request Body – JSON**
```json
{
  "wCDescription": "Updated description.",
  "wCSpecies": "Bear",
  "wCSubSpecies": "Brown Bear",
  "wCHeight": 6.0,
  "wCWeight": 400.0,
  "woodlandCreatureLocation": "Forests and mountains",
  "wCLifeExpectancy": 25.0
}
```

**Response – the updated WoodlandCreature**
```json
{
  "woodlandCreatureID": 5,
  ...
}
```

---

### **/delete/{creatureId}** (GET or DELETE)  
Deletes a creature by its ID.

**Parameters**  
- Path Variable: `creatureId` `<integer>` — **REQUIRED**

**Response – Success message**
```text
Creature deleted
```

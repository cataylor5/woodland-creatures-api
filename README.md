# Woodland Creatures API

A Spring Boot REST API for managing woodland creatures.

### 🔗 Base URL
```
http://localhost:8080/woodlandcreatures
```

---

### **GET /all**  
Returns a list of all woodland creatures.

**Response**
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
  }
]
```

---

### **GET /{creatureId}**  
Returns one creature by ID.

**Path Variable**
- `creatureId`: `<int>` — Required

**Response**
```json
{
  "woodlandCreatureID": 1,
  "wCDescription": "A medium-sized wild cat with tufted ears.",
  ...
}
```

---

### **GET /description?search=keyword**  
Returns all creatures with the keyword in their description.

**Query Param**
- `search`: `<string>` — Required

**Response**
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

### **GET /species/{species}**  
Returns all creatures of a specific species.

**Path Variable**
- `species`: `<string>` — Required

**Response**
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

### **GET /tall?height=number**  
Returns all creatures taller than the given height.

**Query Param**
- `height`: `<double>` — Required

**Response**
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

### **POST /new**  
Adds a new creature to the database.

**Request Body**
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

**Response**
```json
{
  "woodlandCreatureID": 26,
  "wCDescription": "A stealthy forest predator.",
  ...
}
```

> ✅ Field names are case-sensitive and must match exactly (e.g. `wCSpecies`, not `wcspecies`).

---

### **PUT /update/{creatureId}**  
Updates an existing creature by ID.

**Path Variable**
- `creatureId`: `<int>` — Required

**Request Body**
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

**Response**
```json
{
  "woodlandCreatureID": 5,
  ...
}
```

---

### **DELETE /delete/{creatureId}**  
Deletes a creature by ID.

**Path Variable**
- `creatureId`: `<int>` — Required

**Response**
```text
Creature deleted
```

---

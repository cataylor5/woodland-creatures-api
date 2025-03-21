package com.woodland.creatures.WoodlandCreatures_api.WoodlandCreatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Returns JSON, not views
@RequestMapping("/woodlandcreatures")
public class WCController {

    @Autowired
    private WCService service;

    // Get all creatures
    @GetMapping("/all")
    public ResponseEntity<List<WoodlandCreatures>> getAllCreatures() {
        return new ResponseEntity<>(service.getAllCreatures(), HttpStatus.OK);
    }

    // Get creature by ID
    @GetMapping("/{creatureId}")
    public ResponseEntity<?> getOneCreature(@PathVariable int creatureId) {
        WoodlandCreatures creature = service.getCreatureById(creatureId);
        if (creature == null) {
            return new ResponseEntity<>("Creature not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(creature, HttpStatus.OK);
    }

    // Get creatures by species
    @GetMapping("/species/{species}")
    public ResponseEntity<List<WoodlandCreatures>> getCreaturesBySpecies(@PathVariable String species) {
        return new ResponseEntity<>(service.getCreaturesBySpecies(species), HttpStatus.OK);
    }

    // Get creatures taller than a given height
    @GetMapping("/tall")
    public ResponseEntity<List<WoodlandCreatures>> getTallCreatures(
            @RequestParam(name = "height", defaultValue = "0") double height) {
        return new ResponseEntity<>(service.getTallCreatures(height), HttpStatus.OK);
    }

    // Get creatures by description search
    @GetMapping("/description")
    public ResponseEntity<List<WoodlandCreatures>> getCreaturesByName(
            @RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getCreaturesByName(search), HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<WoodlandCreatures> addNewCreature(@RequestBody WoodlandCreatures creature) {
        service.addNewCreature(creature);
        return new ResponseEntity<>(creature, HttpStatus.CREATED);
    }


    // Update an existing creature
    @PostMapping("/update/{creatureId}")
    public ResponseEntity<?> updateCreature(@PathVariable int creatureId, @RequestBody WoodlandCreatures creature) {
        WoodlandCreatures existing = service.getCreatureById(creatureId);
        if (existing == null) {
            return new ResponseEntity<>("Creature not found", HttpStatus.NOT_FOUND);
        }
        service.updateCreature(creatureId, creature);
        return new ResponseEntity<>(creature, HttpStatus.OK);
    }

    // Delete a creature by ID
    @DeleteMapping("/delete/{creatureId}")
    public ResponseEntity<?> deleteCreatureById(@PathVariable int creatureId) {
        WoodlandCreatures existing = service.getCreatureById(creatureId);
        if (existing == null) {
            return new ResponseEntity<>("Creature not found", HttpStatus.NOT_FOUND);
        }
        service.deleteCreatureById(creatureId);
        return new ResponseEntity<>("Creature deleted", HttpStatus.OK);
    }
}

package com.woodland.creatures.WoodlandCreatures_api.WoodlandCreatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * WCService.java
 * Centralizes data access to the Woodland Creatures database.
 */
@Service // Marks this class as a service component in the Spring application
public class WCService {

    @Autowired // Injects the WCRepository dependency
    private WCRepository wcRepository;

    /**
     * Fetch all Woodland Creatures.
     *
     * @return the list of all woodland creatures.
     */
    public List<WoodlandCreatures> getAllCreatures() {
        return wcRepository.findAll();
    }

    /**
     * Fetch a unique Woodland Creature by its ID.
     *
     * @param creatureId the unique woodland creature ID.
     * @return the corresponding Woodland Creature object, or null if not found.
     */
    public WoodlandCreatures getCreatureById(int creatureId) {
        return wcRepository.findById(creatureId).orElse(null);
    }

    /**
     * Fetch all creatures whose species matches the search term.
     *
     * @param species the search key.
     * @return the list of matching Woodland Creatures.
     */
    public List<WoodlandCreatures> getCreaturesBySpecies(String species) {
        return wcRepository.getCreaturesBySpecies(species);
    }

    /**
     * Fetch all creatures with a height above a given threshold.
     *
     * @param height the height threshold.
     * @return the list of Woodland Creatures taller than the threshold.
     */
    public List<WoodlandCreatures> getTallCreatures(double height) {
        return wcRepository.getCreaturesTallerThan(height);
    }

    /**
     * Fetch all creatures with a name that contains the given string.
     *
     * @param name the search name.
     * @return the list of matching Woodland Creatures.
     */
    public List<WoodlandCreatures> getCreaturesByName(String name) {
        return wcRepository.getCreaturesByName(name);
    }

    /**
     * Add a new Woodland Creature to the database.
     *
     * @param creature the new Woodland Creature to add.
     */
    public void addNewCreature(WoodlandCreatures creature) {
        wcRepository.save(creature);
    }

    /**
     * Update an existing Woodland Creature.
     *
     * @param creatureId the unique creature ID.
     * @param updatedCreature the new Woodland Creature details.
     */
    public void updateCreature(int creatureId, WoodlandCreatures updatedCreature) {
        Optional<WoodlandCreatures> optionalCreature = wcRepository.findById(creatureId);

        if (optionalCreature.isPresent()) {
            WoodlandCreatures existing = optionalCreature.get();
            existing.setWCDescription(updatedCreature.getWCDescription());
            existing.setWCSpecies(updatedCreature.getWCSpecies());
            existing.setWCSubSpecies(updatedCreature.getWCSubSpecies());
            existing.setWCHeight(updatedCreature.getWCHeight());
            existing.setWCWeight(updatedCreature.getWCWeight());
            existing.setWoodlandCreatureLocation(updatedCreature.getWoodlandCreatureLocation());
            existing.setWCLifeExpectancy(updatedCreature.getWCLifeExpectancy());

            // Save the updated entity back to the database
            wcRepository.save(existing);
        }
    }

    /**
     * Delete a unique Woodland Creature.
     *
     * @param creatureId the unique creature ID.
     */
    public void deleteCreatureById(int creatureId) {
        wcRepository.deleteById(creatureId);
    }
}

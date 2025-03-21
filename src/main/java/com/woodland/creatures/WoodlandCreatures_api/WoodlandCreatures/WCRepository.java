package com.woodland.creatures.WoodlandCreatures_api.WoodlandCreatures;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * WCRepository.java
 * This interface provides database transactions for the Woodland Creatures table.
 * It extends JpaRepository to enable CRUD operations and custom queries.
 */
@Repository // Marks this as a Spring Data JPA repository, allowing Spring to manage it.
public interface WCRepository extends JpaRepository<WoodlandCreatures, Integer> {
    // The JpaRepository provides built-in methods such as:
    // findAll(), findById(id), save(entity), deleteById(id), etc.

    /**
     * Find all Woodland Creatures by species.
     *
     * This method follows Spring Data JPA naming conventions to automatically generate a SQL query.
     * Equivalent to: SELECT * FROM woodland_creatures WHERE wCSpecies = ?
     *
     * @param species The species name to search for.
     * @return A list of matching Woodland Creatures.
     */
    @Query("SELECT wc FROM WoodlandCreatures wc WHERE wc.wCSpecies = ?1")
    List<WoodlandCreatures> getCreaturesBySpecies(String species);

    /**
     * Find all Woodland Creatures taller than a given height.
     *
     * Uses a native SQL query because Spring Data JPA does not infer "greater than" (>=) queries automatically.
     * Equivalent to: SELECT * FROM woodland_creatures WHERE wCHeight >= ?
     *
     * @param height The height threshold in feet/meters.
     * @return A list of Woodland Creatures taller than the given threshold.
     */
    @Query(value = "SELECT * FROM woodland_creatures wc WHERE wc.wCHeight >= ?1", nativeQuery = true)
    List<WoodlandCreatures> getCreaturesTallerThan(double height);

    /**
     * Find all Woodland Creatures whose description contains a given search term.
     *
     * Uses a native SQL query with the LIKE operator for partial matches.
     * The '%' wildcard allows matching substrings within wCDescription.
     * Equivalent to: SELECT * FROM woodland_creatures WHERE wCDescription LIKE %?%
     *
     * @param name The search term to match within the creature's description.
     * @return A list of Woodland Creatures that contain the search term in their description.
     */
    @Query(value = "SELECT * FROM woodland_creatures wc WHERE wc.wCDescription LIKE %?1%", nativeQuery = true)
    List<WoodlandCreatures> getCreaturesByName(String name);
}


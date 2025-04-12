package com.woodland.creatures.WoodlandCreatures_api.WoodlandCreatures;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * WCRepository.java
 * This interface provides database transactions for the Woodland Creatures table.
 */
@Repository
public interface WCRepository extends JpaRepository<WoodlandCreatures, Integer> {

    /**
     * Find all Woodland Creatures by species.
     *
     * This method uses JPQL (Java field names).
     */
    @Query("SELECT wc FROM WoodlandCreatures wc WHERE wc.wcspecies = ?1")
    List<WoodlandCreatures> getCreaturesBySpecies(String species);

    /**
     * Find all Woodland Creatures taller than a given height.
     *
     * This method uses native SQL (database column names).
     */
    @Query(value = "SELECT * FROM woodland_creatures wc WHERE wc.wcheight >= ?1", nativeQuery = true)
    List<WoodlandCreatures> getCreaturesTallerThan(double height);

    /**
     * Find all Woodland Creatures whose description contains a given search term.
     *
     * This method uses native SQL (database column names).
     */
    @Query(value = "SELECT * FROM woodland_creatures wc WHERE wc.wcdescription LIKE %?1%", nativeQuery = true)
    List<WoodlandCreatures> getCreaturesByName(String name);
}

package com.woodland.creatures.WoodlandCreatures_api.WoodlandCreatures;

import jakarta.persistence.*; // Importing JPA annotations for database mapping

/**
 * This class represents an entity that maps to the "woodland_creatures" table in MySQL.
 */
@Entity // Marks this class as a JPA entity (table mapping)
@Table(name = "woodland_creatures") // Specifies the actual table name in the database
public class WoodlandCreatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "woodlandCreatureID") // <-- add this
    private int woodlandCreatureID;

    @Column(name = "wCDescription", nullable = false)
    private String wCDescription;

    @Column(name = "wCSpecies", nullable = false)
    private String wCSpecies;

    @Column(name = "wCSubSpecies")
    private String wCSubSpecies;

    @Column(name = "wCHeight")
    private double wCHeight;

    @Column(name = "wCWeight")
    private double wCWeight;

    @Column(name = "woodlandCreatureLocation")
    private String woodlandCreatureLocation;

    @Column(name = "wCLifeExpectancy")
    private double wCLifeExpectancy;


    /**
     * Full constructor (for retrieving existing records with an ID).
     * Used when reading from the database.
     */
    public WoodlandCreatures(int woodlandCreatureID, String wCDescription, String wCSpecies, String wCSubSpecies,
                             double wCHeight, double wCWeight, String woodlandCreatureLocation, double wCLifeExpectancy) {
        this.woodlandCreatureID = woodlandCreatureID;
        this.wCDescription = wCDescription;
        this.wCSpecies = wCSpecies;
        this.wCSubSpecies = wCSubSpecies;
        this.wCHeight = wCHeight;
        this.wCWeight = wCWeight;
        this.woodlandCreatureLocation = woodlandCreatureLocation;
        this.wCLifeExpectancy = wCLifeExpectancy;
    }

    /**
     * Partial constructor (without ID).
     * Used when inserting a new record since the ID is auto-generated.
     */
    public WoodlandCreatures(String wCDescription, String wCSpecies, String wCSubSpecies,
                             double wCHeight, double wCWeight, String woodlandCreatureLocation, double wCLifeExpectancy) {
        this.wCDescription = wCDescription;
        this.wCSpecies = wCSpecies;
        this.wCSubSpecies = wCSubSpecies;
        this.wCHeight = wCHeight;
        this.wCWeight = wCWeight;
        this.woodlandCreatureLocation = woodlandCreatureLocation;
        this.wCLifeExpectancy = wCLifeExpectancy;
    }

    /**
     * No-argument constructor.
     * Required by JPA to instantiate objects without parameters.
     */
    public WoodlandCreatures() {
    }

    // ------------------- Getters and Setters -------------------

    /**
     * Returns the unique ID of the woodland creature.
     */
    public int getWoodlandCreatureID() {
        return woodlandCreatureID;
    }

    /**
     * Sets the unique ID of the woodland creature.
     */
    public void setWoodlandCreatureID(int woodlandCreatureID) {
        this.woodlandCreatureID = woodlandCreatureID;
    }

    /**
     * Returns the description of the creature.
     */
    public String getWCDescription() {
        return wCDescription;
    }

    /**
     * Sets the description of the creature.
     */
    public void setWCDescription(String wCDescription) {
        this.wCDescription = wCDescription;
    }

    /**
     * Returns the species of the creature.
     */
    public String getWCSpecies() {
        return wCSpecies;
    }

    /**
     * Sets the species of the creature.
     */
    public void setWCSpecies(String wCSpecies) {
        this.wCSpecies = wCSpecies;
    }

    /**
     * Returns the subspecies (if any) of the creature.
     */
    public String getWCSubSpecies() {
        return wCSubSpecies;
    }

    /**
     * Sets the subspecies of the creature.
     */
    public void setWCSubSpecies(String wCSubSpecies) {
        this.wCSubSpecies = wCSubSpecies;
    }

    /**
     * Returns the height of the creature.
     */
    public double getWCHeight() {
        return wCHeight;
    }

    /**
     * Sets the height of the creature.
     */
    public void setWCHeight(double wCHeight) {
        this.wCHeight = wCHeight;
    }

    /**
     * Returns the weight of the creature.
     */
    public double getWCWeight() {
        return wCWeight;
    }

    /**
     * Sets the weight of the creature.
     */
    public void setWCWeight(double wCWeight) {
        this.wCWeight = wCWeight;
    }

    /**
     * Returns the common habitat/location of the creature.
     */
    public String getWoodlandCreatureLocation() {
        return woodlandCreatureLocation;
    }

    /**
     * Sets the common habitat/location of the creature.
     */
    public void setWoodlandCreatureLocation(String woodlandCreatureLocation) {
        this.woodlandCreatureLocation = woodlandCreatureLocation;
    }

    /**
     * Returns the expected lifespan of the creature.
     */
    public double getWCLifeExpectancy() {
        return wCLifeExpectancy;
    }

    /**
     * Sets the expected lifespan of the creature.
     */
    public void setWCLifeExpectancy(double wCLifeExpectancy) {
        this.wCLifeExpectancy = wCLifeExpectancy;
    }
}

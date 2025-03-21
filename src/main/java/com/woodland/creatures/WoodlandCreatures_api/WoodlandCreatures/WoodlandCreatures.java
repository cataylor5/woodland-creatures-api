package com.woodland.creatures.WoodlandCreatures_api.WoodlandCreatures;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

/**
 * This class represents an entity that maps to the "woodland_creatures" table in MySQL.
 */
@Entity
@Table(name = "woodland_creatures")
public class WoodlandCreatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "woodlandCreatureID")
    @JsonProperty("woodlandCreatureID")
    private int woodlandCreatureID;

    @Column(name = "wCDescription", nullable = false)
    @JsonProperty("wCDescription")
    private String wCDescription;

    @Column(name = "wCSpecies", nullable = false)
    @JsonProperty("wCSpecies, wcspecies")
    private String wCSpecies;

    @Column(name = "wCSubSpecies")
    @JsonProperty("wCSubSpecies")
    private String wCSubSpecies;

    @Column(name = "wCHeight")
    @JsonProperty("wCHeight")
    private double wCHeight;

    @Column(name = "wCWeight")
    @JsonProperty("wCWeight")
    private double wCWeight;

    @Column(name = "woodlandCreatureLocation")
    @JsonProperty("woodlandCreatureLocation")
    private String woodlandCreatureLocation;

    @Column(name = "wCLifeExpectancy")
    @JsonProperty("wCLifeExpectancy")
    private double wCLifeExpectancy;

    // ----------- Constructors -----------

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

    public WoodlandCreatures() {}

    // ----------- Getters and Setters -----------

    public int getWoodlandCreatureID() {
        return woodlandCreatureID;
    }

    public void setWoodlandCreatureID(int woodlandCreatureID) {
        this.woodlandCreatureID = woodlandCreatureID;
    }

    public String getWCDescription() {
        return wCDescription;
    }

    public void setWCDescription(String wCDescription) {
        this.wCDescription = wCDescription;
    }

    public String getWCSpecies() {
        return wCSpecies;
    }

    public void setWCSpecies(String wCSpecies) {
        this.wCSpecies = wCSpecies;
    }

    public String getWCSubSpecies() {
        return wCSubSpecies;
    }

    public void setWCSubSpecies(String wCSubSpecies) {
        this.wCSubSpecies = wCSubSpecies;
    }

    public double getWCHeight() {
        return wCHeight;
    }

    public void setWCHeight(double wCHeight) {
        this.wCHeight = wCHeight;
    }

    public double getWCWeight() {
        return wCWeight;
    }

    public void setWCWeight(double wCWeight) {
        this.wCWeight = wCWeight;
    }

    public String getWoodlandCreatureLocation() {
        return woodlandCreatureLocation;
    }

    public void setWoodlandCreatureLocation(String woodlandCreatureLocation) {
        this.woodlandCreatureLocation = woodlandCreatureLocation;
    }

    public double getWCLifeExpectancy() {
        return wCLifeExpectancy;
    }

    public void setWCLifeExpectancy(double wCLifeExpectancy) {
        this.wCLifeExpectancy = wCLifeExpectancy;
    }
}

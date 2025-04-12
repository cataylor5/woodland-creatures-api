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
    @Column(name = "woodlandcreatureid")  // lowercase matches database
    @JsonProperty("woodlandcreatureid")
    private int woodlandcreatureid;

    @Column(name = "wcdescription", nullable = false)
    @JsonProperty("wcdescription")
    private String wcdescription;

    @Column(name = "wcspecies", nullable = false)
    @JsonProperty("wcspecies")
    private String wcspecies;

    @Column(name = "wcsub_species")
    @JsonProperty("wcsub_species")
    private String wcsub_species;

    @Column(name = "wcheight")
    @JsonProperty("wcheight")
    private double wcheight;

    @Column(name = "wcweight")
    @JsonProperty("wcweight")
    private double wcweight;

    @Column(name = "woodland_creature_location")
    @JsonProperty("woodland_creature_location")
    private String woodland_creature_location;

    @Column(name = "wclife_expectancy")
    @JsonProperty("wclife_expectancy")
    private double wclife_expectancy;

    // ----------- Constructors -----------

    public WoodlandCreatures(int woodlandcreatureid, String wcdescription, String wcspecies, String wcsub_species,
                             double wcheight, double wcweight, String woodland_creature_location, double wclife_expectancy) {
        this.woodlandcreatureid = woodlandcreatureid;
        this.wcdescription = wcdescription;
        this.wcspecies = wcspecies;
        this.wcsub_species = wcsub_species;
        this.wcheight = wcheight;
        this.wcweight = wcweight;
        this.woodland_creature_location = woodland_creature_location;
        this.wclife_expectancy = wclife_expectancy;
    }

    public WoodlandCreatures(String wcdescription, String wcspecies, String wcsub_species,
                             double wcheight, double wcweight, String woodland_creature_location, double wclife_expectancy) {
        this.wcdescription = wcdescription;
        this.wcspecies = wcspecies;
        this.wcsub_species = wcsub_species;
        this.wcheight = wcheight;
        this.wcweight = wcweight;
        this.woodland_creature_location = woodland_creature_location;
        this.wclife_expectancy = wclife_expectancy;
    }

    public WoodlandCreatures() {}

    // ----------- Getters and Setters -----------

    public int getWoodlandcreatureid() {
        return woodlandcreatureid;
    }

    public void setWoodlandcreatureid(int woodlandcreatureid) {
        this.woodlandcreatureid = woodlandcreatureid;
    }

    public String getWcdescription() {
        return wcdescription;
    }

    public void setWcdescription(String wcdescription) {
        this.wcdescription = wcdescription;
    }

    public String getWcspecies() {
        return wcspecies;
    }

    public void setWcspecies(String wcspecies) {
        this.wcspecies = wcspecies;
    }

    public String getWcsub_species() {
        return wcsub_species;
    }

    public void setWcsub_species(String wcsub_species) {
        this.wcsub_species = wcsub_species;
    }

    public double getWcheight() {
        return wcheight;
    }

    public void setWcheight(double wcheight) {
        this.wcheight = wcheight;
    }

    public double getWcweight() {
        return wcweight;
    }

    public void setWcweight(double wcweight) {
        this.wcweight = wcweight;
    }

    public String getWoodland_creature_location() {
        return woodland_creature_location;
    }

    public void setWoodland_creature_location(String woodland_creature_location) {
        this.woodland_creature_location = woodland_creature_location;
    }

    public double getWclife_expectancy() {
        return wclife_expectancy;
    }

    public void setWclife_expectancy(double wclife_expectancy) {
        this.wclife_expectancy = wclife_expectancy;
    }
}

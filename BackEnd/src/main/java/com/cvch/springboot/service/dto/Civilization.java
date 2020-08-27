package com.cvch.springboot.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Civilization implements Serializable {

    @JsonProperty(value= "id")
    public Long id;
    @JsonProperty(value= "name")
    public String name;
    @JsonProperty(value= "expansion")
    public String expansion;
    @JsonProperty(value= "army_type")
    public String armyType;
    @JsonProperty(value= "unique_unit")
    public List<String> uniqueUnit;
    @JsonProperty(value= "unique_tech")
    public List<String> uniqueTech;
    @JsonProperty(value= "team_bonus")
    public String teamBonus;
    @JsonProperty(value= "civilization_bonus")
    public List<String> civilizationBonus;

    public Civilization() {
    }

    public Civilization(Long id, String name, String expansion, String armyType, List<String> uniqueUnit, List<String> uniqueTech, String publicTeamBonus, List<String> civilizationBonus) {
        this.id = id;
        this.name = name;
        this.expansion = expansion;
        this.armyType = armyType;
        this.uniqueUnit = uniqueUnit;
        this.uniqueTech = uniqueTech;
        this.teamBonus = publicTeamBonus;
        this.civilizationBonus = civilizationBonus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getArmyType() {
        return armyType;
    }

    public void setArmyType(String armyType) {
        this.armyType = armyType;
    }

    public List<String> getUniqueUnit() {
        return uniqueUnit;
    }

    public void setUniqueUnit(List<String> uniqueUnit) {
        this.uniqueUnit = uniqueUnit;
    }

    public List<String> getUniqueTech() {
        return uniqueTech;
    }

    public void setUniqueTech(List<String> uniqueTech) {
        this.uniqueTech = uniqueTech;
    }

    public String getteamBonus() {
        return teamBonus;
    }

    public void setTeamBonus(String publicTeamBonus) {
        this.teamBonus = publicTeamBonus;
    }

    public List<String> getCivilizationBonus() {
        return civilizationBonus;
    }

    public void setCivilizationBonus(List<String> civilizationBonus) {
        this.civilizationBonus = civilizationBonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Civilization that = (Civilization) o;
        return id.equals(that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(expansion, that.expansion) &&
                Objects.equals(armyType, that.armyType) &&
                Objects.equals(uniqueUnit, that.uniqueUnit) &&
                Objects.equals(uniqueTech, that.uniqueTech) &&
                Objects.equals(teamBonus, that.teamBonus) &&
                Objects.equals(civilizationBonus, that.civilizationBonus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, expansion, armyType, uniqueUnit, uniqueTech, teamBonus, civilizationBonus);
    }

    @Override
    public String toString() {
        return "Civilization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expansion='" + expansion + '\'' +
                ", armyType='" + armyType + '\'' +
                ", uniqueUnit=" + uniqueUnit +
                ", uniqueTech=" + uniqueTech +
                ", publicTeamBonus='" + teamBonus + '\'' +
                ", civilizationBonus=" + civilizationBonus +
                '}';
    }
}

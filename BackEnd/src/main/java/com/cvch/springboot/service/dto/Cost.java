package com.cvch.springboot.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class Cost implements Serializable {

    @JsonProperty(value = "Wood")
    public String wood;
    @JsonProperty(value = "Gold")
    public String gold;

    public Cost() {
    }

    public Cost(String wood, String gold) {
        this.wood = wood;
        this.gold = gold;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cost cost = (Cost) o;
        return Objects.equals(wood, cost.wood) &&
                Objects.equals(gold, cost.gold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wood, gold);
    }

    @Override
    public String toString() {
        return "Cost{" +
                "wood='" + wood + '\'' +
                ", gold='" + gold + '\'' +
                '}';
    }
}

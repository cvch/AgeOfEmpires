package com.cvch.springboot.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Unit implements Serializable {

    @JsonProperty(value= "id")
    public Long id;
    @JsonProperty(value= "id")
    public String name;
    @JsonProperty(value= "description")
    public String description;
    @JsonProperty(value= "expansion")
    public String expansion;
    @JsonProperty(value= "age")
    public String age;
    @JsonProperty(value= "created_in")
    public String createdIn;
    @JsonProperty(value= "cost")
    public Cost cost;
    @JsonProperty(value= "build_time")
    public String buildTime;
    @JsonProperty(value= "reload_time")
    public String reloadTime;
    @JsonProperty(value= "attack_delay")
    public String attackDelay;
    @JsonProperty(value= "movementRate")
    public String movementRate;
    @JsonProperty(value= "line_of_sight")
    public String lineOfSight;
    @JsonProperty(value= "hit_points")
    public String hitPoints;
    @JsonProperty(value= "range")
    public String range;
    @JsonProperty(value= "attack")
    public String attack;
    @JsonProperty(value= "armor")
    public String armor;
    @JsonProperty(value= "accuracy")
    public String accuracy;
}

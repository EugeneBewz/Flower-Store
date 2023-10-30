package ua.edu.ucu.apps.flowerstore.items.flowers;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FlowerColor {
    @JsonProperty("Blue")
    BLUE,
    @JsonProperty("Red")
    RED,
    @JsonProperty("White")
    WHITE
}

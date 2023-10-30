package ua.edu.ucu.apps.flowerstore.items.flowers;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FlowerType {
    @JsonProperty("Rose")
    ROSE,
    @JsonProperty("Chamomile")
    CHAMOMILE,
    @JsonProperty("Tulip")
    TULIP,
    @JsonProperty("Cactus")
    CACTUS
}

package ua.edu.ucu.apps.flowerstore.items;

import lombok.Getter;

@Getter
public abstract class Item {
    public abstract double getPrice();
    public abstract String getDescription();

}

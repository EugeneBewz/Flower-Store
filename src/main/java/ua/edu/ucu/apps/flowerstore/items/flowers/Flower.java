package ua.edu.ucu.apps.flowerstore.items.flowers;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.edu.ucu.apps.flowerstore.items.Item;

@Getter @AllArgsConstructor @ToString @NoArgsConstructor
@Entity
@Table
public class Flower extends Item {
    @Id
    @SequenceGenerator(
            name = "flowers_sequence",
            sequenceName = "flowers_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flowers_sequence"
    )

    private Long id;
    private FlowerType flowerType;
    private double price;
    public double sepalLength;
    private String color;
    private String description;

    public Flower(Long id,
                  FlowerType flowerType,
                  double price,
                  double sepalLength,
                  FlowerColor flowerColor,
                  String description) {
        /*
         * Copy constructor for Flower()
         */
        this.id = id;
        this.flowerType = flowerType;
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = flowerColor.toString();
        this.description = description;
    }

    public Flower(Flower flower) {
        this.id = flower.id;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.getColor();
        this.description = flower.getDescription();
    }

    public String getFlowerType() {
        return flowerType.toString();
    }

    public void setPrice(int price) {
        this.price = Math.max(0, price);  // avoid setting negative price
    }

    public void setColor(FlowerColor color) {
        this.color = color.toString();
    }
}

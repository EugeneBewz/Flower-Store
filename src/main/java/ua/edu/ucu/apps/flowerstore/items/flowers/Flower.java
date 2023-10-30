package ua.edu.ucu.apps.flowerstore.items.flowers;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @AllArgsConstructor @ToString @NoArgsConstructor
@Entity
@Table
public class Flower {
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

    public Flower(FlowerType flowerType,
                  double price,
                  double sepalLength,
                  FlowerColor flowerColor) {
        /*
         * Copy constructor for Flower()
         */
        this.flowerType = flowerType;
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = flowerColor.toString();
    }

    public Flower(Flower flower) {
        this.id = flower.id;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.getColor();
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

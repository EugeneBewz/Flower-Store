package ua.edu.ucu.apps.flowerstore.items.flowers;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ua.edu.ucu.apps.flowerstore.decorators.Item;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower implements Item {
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
    @Getter
    private String description;

    public Flower(Long id,
                  FlowerType flowerType,
                  double new_price,
                  double sepalLength,
                  FlowerColor flowerColor,
                  String new_description) {
        /*
         * Copy constructor for Flower()
         */
        this.id = id;
        this.flowerType = flowerType;
        this.sepalLength = sepalLength;
        this.color = flowerColor.toString();
        this.price = new_price;
        this.description = new_description;
    }

    public Flower(Flower flower) {
        this.id = flower.getId();
        this.flowerType = flower.flowerType;
        this.sepalLength = flower.getSepalLength();
        this.color = flower.getColor();
        this.price = flower.price;
        this.description = flower.description;
    }

    public String getFlowerType() {
        return flowerType.toString();
    }

    public void setPrice(int price) {
        price = Math.max(0, price);  // avoid setting a negative price
    }

    public void setColor(FlowerColor color) {
        this.color = color.toString();
    }

    public double price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + this.getId() +
                ", flowerType=" + this.getFlowerType() +
                ", price=" + this.price() +
                ", sepalLength=" + this.getSepalLength() +
                ", color='" + this.getColor() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                '}';
    }
}

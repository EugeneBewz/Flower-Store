package ua.edu.ucu.apps.flowerstore.items.flowers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

@Configuration
public class FlowerConfig {
    @Order(1)
    @Bean
    CommandLineRunner configureFlowers(FlowerRepository repository) {
        return args -> {
            Flower flower1 = new Flower(
                    1L,
                    FlowerType.ROSE,
                    120,
                    80,
                    FlowerColor.RED,
                    "Red Rose"
            );

            Flower flower2 = new Flower(
                    2L,
                    FlowerType.CHAMOMILE,
                    100,
                    50,
                    FlowerColor.WHITE,
                    "White Chamomile"
            );

            Flower flower3 = new Flower(
                    3L,
                    FlowerType.TULIP,
                    110,
                    60,
                    FlowerColor.BLUE,
                    "Blue Tulip"
            );

            repository.saveAll(
                    List.of(
                            flower1,
                            flower2,
                            flower3
                    )
            );
        };
    }
}

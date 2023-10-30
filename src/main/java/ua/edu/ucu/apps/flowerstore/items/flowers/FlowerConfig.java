package ua.edu.ucu.apps.flowerstore.items.flowers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FlowerConfig {
    @Bean
    CommandLineRunner commandLineRunner(FlowerRepository repository) {
        return args -> {
            Flower flower1 = new Flower(
                    FlowerType.ROSE,
                    120,
                    80,
                    FlowerColor.RED
            );

            Flower flower2 = new Flower(
                    FlowerType.CHAMOMILE,
                    100,
                    50,
                    FlowerColor.WHITE
            );

            Flower flower3 = new Flower(
                    FlowerType.TULIP,
                    110,
                    60,
                    FlowerColor.BLUE
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

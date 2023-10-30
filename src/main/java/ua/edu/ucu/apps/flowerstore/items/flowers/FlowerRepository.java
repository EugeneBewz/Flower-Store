package ua.edu.ucu.apps.flowerstore.items.flowers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {
    @Query("SELECT s FROM Flower s WHERE s.color = ?1")
    Optional<Flower> findFlowerByType(String type);
}

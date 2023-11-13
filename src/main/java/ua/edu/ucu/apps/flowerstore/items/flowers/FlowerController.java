package ua.edu.ucu.apps.flowerstore.items.flowers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/flowers")
public class FlowerController {
	public final FlowerService flowerService;

	@Autowired
	public  FlowerController(FlowerService flowerService) {
		this.flowerService = flowerService;
	}

    @GetMapping
	public List	<Flower> getFlowers() {
		return flowerService.getFlowers();
	}

	@PostMapping
	public void addFlower(@RequestBody Flower flower) {
		flowerService.addFlower(flower);
	}
}

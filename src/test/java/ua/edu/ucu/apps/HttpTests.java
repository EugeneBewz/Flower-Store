package ua.edu.ucu.apps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest
public class HttpTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testYourEndpoint() {
        String response = restTemplate.getForObject("/api/flowers", String.class);
        // Add assertions to verify the response
    }
}

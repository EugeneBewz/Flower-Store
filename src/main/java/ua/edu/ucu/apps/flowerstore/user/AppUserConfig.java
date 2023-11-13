package ua.edu.ucu.apps.flowerstore.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class AppUserConfig {
    @Bean
    CommandLineRunner commandLineRunner(AppUserRepository repository) {
        return args -> {
            AppUser john_doe = new AppUser(
                    "John Doe",
                    "john.doe@gmail.com",
                    LocalDate.of(2004, Month.DECEMBER, 30)
            );

            AppUser mary_sue = new AppUser(
                    "Mary Sue",
                    "mary.sue@gmail.com",
                    LocalDate.of(2005, Month.DECEMBER, 30)
            );

            AppUser emily_rose = new AppUser(
                    "Emily Rose",
                    "emily.rose@gmail.com",
                    LocalDate.of(2006, Month.DECEMBER, 30)
            );
            repository.saveAll(
                    List.of(john_doe, mary_sue, emily_rose)
            );
        };
    }
}

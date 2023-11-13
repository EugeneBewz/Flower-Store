package ua.edu.ucu.apps.flowerstore.user;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @GetMapping
    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public void addNewAppUser(AppUser appUser) {
        Optional<AppUser> userByEmail = appUserRepository.findAppUserByEmail(appUser.getEmail());
        if (userByEmail.isPresent()) {
            throw new IllegalStateException("Email is already registered");
        }
        appUserRepository.save(appUser);
    }


    public void deleteAppUser(Long userId) {
        boolean userExists = appUserRepository.existsById(userId);
        if (!userExists) {
            throw new IllegalStateException("User with id " + userId + " does not exist");
        }
        appUserRepository.deleteById(userId);
    }

    @Transactional
    public void updateAppUser(Long userId, String name, String email) {
        AppUser appUser = appUserRepository.findById(userId).orElseThrow(
            () -> new IllegalStateException(
                    "User with id " + userId + " does not exist"
            )
        );

        if (name != null && !name.isEmpty() && !Objects.equals(appUser.getName(), name)) {
            appUser.setName(name);
        }

        if (email != null && !email.isEmpty() && !Objects.equals(appUser.getEmail(), email)) {
            Optional<AppUser> checkingAppUser = appUserRepository.findAppUserByEmail(email);
            if (checkingAppUser.isPresent()) {
                throw new IllegalStateException("Email has been already taken");
            }
            appUser.setEmail(email);
        }
    }
}

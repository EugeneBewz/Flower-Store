package ua.edu.ucu.apps.flowerstore.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class AppUserController {
    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getUsers() {
        return appUserService.getUsers();
    }

    @PostMapping
    public void registerNewAppUser(@RequestBody AppUser appUser) {
        appUserService.addNewAppUser(appUser);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteAppUser(@PathVariable("userId") Long userId) {
        appUserService.deleteAppUser(userId);
    }

    @PutMapping(path = "{userId}")
    public void updateAppUser(
            @PathVariable("userId") Long userId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ) {
        appUserService.updateAppUser(userId, name, email);
    }
}

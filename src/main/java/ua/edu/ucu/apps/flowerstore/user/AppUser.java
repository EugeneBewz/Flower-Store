package ua.edu.ucu.apps.flowerstore.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

/**
 * User class to store data of store user
 */
@Getter @Setter
@Entity
@Table
public class AppUser {
    @Id
    @SequenceGenerator(
            name = "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    @Transient
    private Integer age;

    /**
     * Empty constructor
     */
    public AppUser() {
    }

    /**
     * All-Args Constructor
     * @param id user ID
     * @param name user name
     * @param email user email
     * @param dateOfBirth user date of birth
     */
    public AppUser(Long id,
                String name,
                String email,
                LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * All-Args constructor without ID
     * @param name user name
     * @param email user email
     * @param dateOfBirth user date of birth
     */
    public AppUser(String name,
                String email,
                LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + getAge() +
                '}';
    }
}

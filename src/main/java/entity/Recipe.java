package entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String title;

    @Column
    String description;

    @Column
    List<String> instructions;

    @Column
    int prepTime;

    @Column
    int cookingTime;

    @Column
    int servings;

    @Column
    String difficultyLevel;

    @Column
    String rating;

    @Column
    List<Ingredient> ingredients;

    @Column
    List<String> categories;

    @JoinColumn(name = "id")
    User creator;

    @Column
    Date dateCreated;

    @Column
    Date lastModified;



}

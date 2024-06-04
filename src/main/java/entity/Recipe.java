package entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Recipe {

    public Recipe() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    List<String> ingredients;

    @Column
    List<String> categories;

    @ManyToOne
    @JoinColumn(name = "user_id")
    ChefUser creator;

    @Column
    Date dateCreated;

    @Column
    Date lastModified;


}

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
    List<String> ingredients;

    @Column
    List<String> categories;

   @Column
    ChefUser creator;

    @Column
    Date dateCreated;

    @Column
    Date lastModified;




}

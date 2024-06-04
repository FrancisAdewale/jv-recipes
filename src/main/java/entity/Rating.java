package entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Rating {

    public Rating() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name="rating_value")
    int rating_value;

    @Column
    Date dateRated;

    @Column
    String associatedRecipe;

    @Column
    String rater;

}

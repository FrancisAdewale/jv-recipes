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

    @Column
    int value;

    @Column
    Date dateRated;

    @Column
    String associatedRecipe;

    @JoinColumn(name = "user_id")
    User rater;

}

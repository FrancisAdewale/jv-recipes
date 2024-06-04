package entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    int value;

    @Column
    Date dateRated;

    @Column
    String associatedRecipe;

    @JoinColumn(name = "id")
    User rater;

}

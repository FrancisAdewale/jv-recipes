package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    int id;

    @Column
    int value;

    @Column
    Date dateRated;

    @Column
    String associatedRecipe;

    @Column
    User rater;

}

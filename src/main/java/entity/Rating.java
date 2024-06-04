package entity;

import jakarta.persistence.*;

import javax.lang.model.element.Name;
import java.util.Date;

@Entity
public class Rating {

    public Rating() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name="rating_value")
    int value;

    @Column
    Date dateRated;

    @Column
    String associatedRecipe;

    @Column
    String rater;

}

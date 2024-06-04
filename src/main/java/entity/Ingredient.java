package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Ingredient {

    @Id
    @Column(name="recipe_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String name;

    @Column
    int quantity;

    @Column
    String unitOfMeasurement;
}

package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Ingredient {

    @Id
    @GeneratedValue

    int id;

    @Column
    String name;

    @Column
    int quantity;

    @Column
    String unitOfMeasurement;
}

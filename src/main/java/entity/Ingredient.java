package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Ingredient {

    @Id
    int id;

    @Column
    String name;

    @Column
    int quantity;

    @Column
    String unitOfMeasurementl;
}

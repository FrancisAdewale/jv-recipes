package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.File;

@Entity
public class Image {

    @Id
    @GeneratedValue
    int id;

    @Column
    String fileName;

    @Column
    File fileData;

    @Column
    String associatedRecipe;

}

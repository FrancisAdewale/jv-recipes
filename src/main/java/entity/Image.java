package entity;

import jakarta.persistence.*;

import java.io.File;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String fileName;

    @Column
    String fileData;

    @Column
    String associatedRecipe;

}

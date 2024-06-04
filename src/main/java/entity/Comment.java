package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    int id;

    @Column
    String text;

    @Column
    Date datePosted;

    @Column
    User author;

    @Column
    String associatedRecipe;









}

package entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String text;

    @Column
    Date datePosted;


    @JoinColumn(name = "id")
    User author;

    @Column
    String associatedRecipe;









}

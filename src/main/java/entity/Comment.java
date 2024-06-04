package entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Comment {

    public Comment() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String text;

    @Column
    Date datePosted;

    @JoinColumn(name = "user_id")
    @ManyToOne
    ChefUser author;

    @Column
    String associatedRecipe;









}

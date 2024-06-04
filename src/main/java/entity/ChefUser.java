package entity;

import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class ChefUser {

    public ChefUser() {
    }

    @OneToMany
    Set<Recipe> recipes;

    @OneToMany
    Set<Comment> comments;

    @OneToOne
    Rating rating;

    @Column(name="user_id")
    @Id
    int id;

    @Column
    String username;

    @Column
    String password;

    @Column
    Role roles;

    @Column
    String email;

    @Column
    Date dateRegistered;

}


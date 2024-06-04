package entity;

import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;

@Entity
public class ChefUser {

    public ChefUser() {
    }


    @Column(name="user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String username;

    @Column
    String password;

    @Column
    String role;

    @Column
    String email;

    @Column
    Date dateRegistered;

}


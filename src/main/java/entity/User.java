package entity;

import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String username;

    @Column
    String password;

    @Column
    Role role;

    @Column
    String email;

    @Column
    Date dateRegistered;



}

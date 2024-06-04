package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.management.relation.Role;
import java.util.Date;

@Entity
public class User {

    @Id
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

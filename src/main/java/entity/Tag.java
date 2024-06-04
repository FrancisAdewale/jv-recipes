package entity;

import jakarta.persistence.*;

@Entity
public class Tag {

    public Tag() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String name;

}

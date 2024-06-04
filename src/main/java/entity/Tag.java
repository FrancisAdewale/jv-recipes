package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tag {

    @Id
    @GeneratedValue
    int id;

    @Column
    String name;

}

package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Comment {

    @Id
    int id;

    @Column
    String text;

    @Column
    Date datePosted;

    @Column
    User author;




}

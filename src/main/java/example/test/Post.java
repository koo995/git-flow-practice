package example.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}

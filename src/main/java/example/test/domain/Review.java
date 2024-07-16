package example.test.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Review {

    @Id @GeneratedValue
    private Long id;

    private String content;
}

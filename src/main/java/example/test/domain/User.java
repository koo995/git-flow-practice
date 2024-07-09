package example.test.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.util.Set;

@Entity
@NoArgsConstructor
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Post> posts;

    private String name2;
}

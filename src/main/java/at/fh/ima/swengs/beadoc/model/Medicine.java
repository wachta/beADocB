package at.fh.ima.swengs.beadoc.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne
    private Document picture;

    @ManyToMany
    private Set<User> consumers;

    private String dosage;

    private Set<String> sideEffects;


}

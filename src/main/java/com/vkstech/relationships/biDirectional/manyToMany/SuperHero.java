package com.vkstech.relationships.biDirectional.manyToMany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class SuperHero {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "superhero_movies",
            joinColumns = {@JoinColumn(name = "superhero_id")},
            inverseJoinColumns = {@JoinColumn(name = "movie_id")}
    )
    private Set<Movie> movies = new HashSet<>();
}

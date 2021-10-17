package com.vkstech.relationships.biDirectional.manyToMany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    @ManyToMany(mappedBy = "movies", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<SuperHero> superHeroes = new HashSet<>();
}

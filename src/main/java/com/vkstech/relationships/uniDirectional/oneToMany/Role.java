package com.vkstech.relationships.uniDirectional.oneToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @OneToMany(targetEntity = User.class)
    private List<User> users;


}

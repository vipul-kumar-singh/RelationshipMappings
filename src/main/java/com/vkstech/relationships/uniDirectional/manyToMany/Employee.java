package com.vkstech.relationships.uniDirectional.manyToMany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String mobile;

    @Column(unique = true)
    private String email;

    @ManyToMany(targetEntity = Permission.class, cascade = CascadeType.ALL)
    private List<Permission> permissions;

}

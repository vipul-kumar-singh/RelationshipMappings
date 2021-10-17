package com.vkstech.relationships.uniDirectional.oneToOne;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String orgId;

    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    private Address address;


}

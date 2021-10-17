package com.vkstech.relationships.uniDirectional.manyToOne;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int storyId;

    @Column(name = "story_name")
    private String storyName;
}

package com.vkstech.relationships.uniDirectional.manyToOne;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    @Column(name = "book_name")
    private String bookName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "story_id", referencedColumnName = "storyId")
    private Story story;

}

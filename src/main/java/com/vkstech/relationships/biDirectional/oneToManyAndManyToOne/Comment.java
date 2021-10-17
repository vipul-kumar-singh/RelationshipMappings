package com.vkstech.relationships.biDirectional.oneToManyAndManyToOne;

import com.vkstech.relationships.biDirectional.oneToOne.Post;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String review;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

}

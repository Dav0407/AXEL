package com.igriss.AXEL.entities;

import com.igriss.AXEL.template.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Post extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price; // Axel Coin

    private Integer views = 0;

    private Boolean isExpired = false;

    private Boolean isSold = false;

    @OneToMany
    private List<Attachment> attachments;

    @OneToOne
    private GameType gameType;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}

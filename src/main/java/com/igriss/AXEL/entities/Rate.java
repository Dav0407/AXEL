package com.igriss.AXEL.entities;

import com.igriss.AXEL.template.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Rate extends BaseEntity {

    private Integer value; // 1, 2, 3, 4, 5

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User ratedBy;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rated_post_id")
    private Post ratedPost;

}

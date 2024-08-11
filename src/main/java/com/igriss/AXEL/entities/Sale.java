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
public class Sale extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private User buyer;

    @OneToOne(fetch = FetchType.LAZY)
    private Post post;

    @Column(nullable = false)
    private Double finalPrice; //AC
}

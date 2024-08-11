package com.igriss.AXEL.entities;

import com.igriss.AXEL.template.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class GameType extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @OneToOne
    private Attachment attachment;
}


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
@Table(name = "users")
@Entity
public class User extends BaseEntity {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private Double balance;
    @OneToOne
    @JoinColumn(name = "profile_photo_id")
    private Attachment profilePhoto;

    @OneToMany(mappedBy = "user")
    private List<SavedPost> savedPosts;
}

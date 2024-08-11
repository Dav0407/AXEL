package com.igriss.AXEL.entities;

import com.igriss.AXEL.template.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "attachment")
public class Attachment extends BaseEntity {
    private String fileName;
    private String filePath;


}
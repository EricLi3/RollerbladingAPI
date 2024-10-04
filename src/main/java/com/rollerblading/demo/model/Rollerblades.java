package com.rollerblading.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Rollerblades")
public class Rollerblades {
    @Id
    private int id;
    private String name;
    private String link;
}

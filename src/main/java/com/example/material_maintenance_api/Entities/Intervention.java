package com.example.material_maintenance_api.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Materiel materiel;

    private String technicien;
    private String description;
    private Date date;

}

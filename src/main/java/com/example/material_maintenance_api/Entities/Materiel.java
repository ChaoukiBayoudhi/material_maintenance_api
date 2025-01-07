package com.example.material_maintenance_api.Entities;

import com.example.material_maintenance_api.Enumerations.StatutMateriel;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Materiel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String type;

    @Enumerated(EnumType.STRING)
    private StatutMateriel statut;}

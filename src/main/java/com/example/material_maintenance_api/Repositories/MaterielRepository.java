package com.example.material_maintenance_api.Repositories;

import com.example.material_maintenance_api.Entities.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterielRepository extends JpaRepository<Materiel, Long> {}

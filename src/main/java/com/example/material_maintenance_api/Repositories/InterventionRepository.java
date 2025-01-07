package com.example.material_maintenance_api.Repositories;

import com.example.material_maintenance_api.Entities.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {}
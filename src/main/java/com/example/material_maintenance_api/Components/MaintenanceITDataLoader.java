package com.example.material_maintenance_api.Components;

import com.example.material_maintenance_api.Entities.Intervention;
import com.example.material_maintenance_api.Entities.Materiel;
import com.example.material_maintenance_api.Enumerations.StatutMateriel;
import com.example.material_maintenance_api.Repositories.InterventionRepository;
import com.example.material_maintenance_api.Repositories.MaterielRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MaintenanceITDataLoader {

    @Bean
    public CommandLineRunner loadMaintenanceData(MaterielRepository materielRepository,
                                                 InterventionRepository interventionRepository) {
        return args -> {
            // Create materials
            Materiel materiel1 = new Materiel();
            materiel1.setNom("Ordinateur Dell");
            materiel1.setType("Ordinateur");
            materiel1.setStatut(StatutMateriel.Fonctionnel);
            materielRepository.save(materiel1);

            Materiel materiel2 = new Materiel();
            materiel2.setNom("Imprimante HP");
            materiel2.setType("Imprimante");
            materiel2.setStatut(StatutMateriel.EnMaintenance);
            materielRepository.save(materiel2);

            // Create interventions
            Intervention intervention1 = new Intervention();
            intervention1.setMateriel(materiel2);
            intervention1.setTechnicien("Jean Dupont");
            intervention1.setDescription("Réparation du rouleau d'impression.");
            intervention1.setDate(new Date());
            interventionRepository.save(intervention1);

            Intervention intervention2 = new Intervention();
            intervention2.setMateriel(materiel1);
            intervention2.setTechnicien("Sophie Martin");
            intervention2.setDescription("Mise à jour des pilotes.");
            intervention2.setDate(new Date());
            interventionRepository.save(intervention2);
        };
    }
}
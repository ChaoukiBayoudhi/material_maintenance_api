package com.example.material_maintenance_api.Web;

import com.example.material_maintenance_api.Entities.Intervention;
import com.example.material_maintenance_api.Entities.Materiel;
import com.example.material_maintenance_api.Repositories.InterventionRepository;
import com.example.material_maintenance_api.Repositories.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MaintenanceController {

    @Autowired
    private MaterielRepository materielRepository;

    @Autowired
    private InterventionRepository interventionRepository;

    @GetMapping("/materiels")
    public List<Materiel> getMateriels() {
        return materielRepository.findAll();
    }

    @PostMapping("/interventions")
    public Intervention createIntervention(@RequestBody Intervention intervention) {
        return interventionRepository.save(intervention);
    }
}
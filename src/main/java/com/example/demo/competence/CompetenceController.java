package com.example.demo.competence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/competence")
public class CompetenceController {
    private final CompetenceService competenceService;
    @Autowired
    public  CompetenceController(CompetenceService competenceService){
        this.competenceService=competenceService;

    }
    @GetMapping
    public List<Competence> getCompetences(){
        return competenceService.getCompetences();
    }
    @GetMapping(path="{competenceId}")
    public Optional<Competence> getCompetence(@PathVariable("competenceId") Long competenceId){
        return competenceService.getCompetence(competenceId);
    }
    @PostMapping
    public void registerNewCompetence(@RequestBody Competence competence){
        competenceService.addNewCompetence(competence);
    }
    @DeleteMapping(path="{competenceId}")
    public void deleteCompetence(@PathVariable("competenceId") Long competenceId){
        competenceService.deleteCompetence(competenceId);
    }
    @PutMapping(path = "{competenceId}")
    public void updateCompetence(
            @PathVariable("competenceId") Long competenceId,
            @RequestParam(required = true) String description) {
        competenceService.updateCompetence(competenceId, description);
    }

    }

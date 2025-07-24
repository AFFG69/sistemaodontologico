package com.whitehat.sistemaodontologico.controller;
import com.whitehat.sistemaodontologico.Paciente;
import com.whitehat.sistemaodontologico.repository.PacienteRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class PacienteController {
    private final PacienteRepository pacienteRepository;

    public PacienteController( PacienteRepository pacienteRepository){
        this.pacienteRepository= pacienteRepository;
    }

    @GetMapping("/pacientes")
    public List<Paciente> getAllPacientes(){

        return pacienteRepository.findAll();

    }
    
    @PostMapping("/pacientes")
    public Paciente guardarpaciente(@RequestBody Paciente paciente) {
        
        return pacienteRepository.save(paciente);
    }
    
    

}

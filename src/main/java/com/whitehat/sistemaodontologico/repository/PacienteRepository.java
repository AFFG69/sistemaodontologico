package com.whitehat.sistemaodontologico.repository;
import com.whitehat.sistemaodontologico.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PacienteRepository extends JpaRepository<Paciente,Integer> {
    
}

package com.whitehat.sistemaodontologico;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        // Crea un objeto Paciente
        Paciente paciente = new Paciente(); 
        
        // Jackson configuracion
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(paciente);
            System.out.println("JSON generado:\n" + json);
        } catch (Exception e) {
            System.err.println("Error al generar JSON: " + e.getMessage());
        }

    }

}


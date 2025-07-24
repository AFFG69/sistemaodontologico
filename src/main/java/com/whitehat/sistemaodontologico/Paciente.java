package com.whitehat.sistemaodontologico;
import java.time.LocalDate;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.print.DocFlavor.STRING;

import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.websocket.Decoder.Text;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.ALWAYS)
public class Paciente {
   
    @Id 
    @Column (name = "id_paciente")
    private Integer idPaciente;
    @Column (name="nombre_completo")
    private String nombrePaciente;
    @Column (name = "fecha_nacimiento")
    private LocalDate fechadenacimiento;
    private String sexo;
    private String direccion;
    private Integer edad;
    private String telefono;
    private String observaciones;

}

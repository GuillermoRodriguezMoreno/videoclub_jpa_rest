package org.iesvdm.videoclub.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "socio",
        schema = "videoclub_jpa",
        indexes ={@Index(name = "idx_dni",columnList = "dni")}
)
public class Socio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "dni")
    private String dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @OneToOne(mappedBy = "socio")
    private Tarjeta tarjeta;
}

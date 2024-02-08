package org.iesvdm.videoclub.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "tarjeta",
        schema = "videoclub_jpa",
        indexes ={@Index(name = "idx_numero",columnList = "numero")}
)
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "numero")
    private String numero;
    @Column(name = "fecha_caducidad")
    private Date caducidad;
    @OneToOne()
    @JoinColumn(name = "socio_id")
    private Socio  socio;
}

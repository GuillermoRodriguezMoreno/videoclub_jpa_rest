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
        name = "tutorial",
        schema = "videoclub_jpa",
        indexes ={@Index(name = "idx_titulo",columnList = "titulo")}
)
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "titulo", length = 50)
    private String titulo;
    @Column(name = "descrip", length = 150)
    private String descripcion;
    @Column(name = "publicado")
    private Boolean publicado;
}

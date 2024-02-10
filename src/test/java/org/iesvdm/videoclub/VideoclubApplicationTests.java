package org.iesvdm.videoclub;

import org.iesvdm.videoclub.domain.Socio;
import org.iesvdm.videoclub.domain.Tarjeta;
import org.iesvdm.videoclub.repository.SocioRepository;
import org.iesvdm.videoclub.repository.TarjetaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class VideoclubApplicationTests {

    @Autowired
    SocioRepository socioRepository;
    @Autowired
    TarjetaRepository tarjetaRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void oneToOnetestSocio() {

        // Crear una tarjeta
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setNumero("1234567890123456");
        tarjeta.setCaducidad(new Date());

        // Hay que guardar tarjeta antes de poder establecer la relación con el socio
        tarjetaRepository.save(tarjeta);

        // Crear un socio y settear la tarjeta
        Socio socio = new Socio();
        socio.setDni("12345678A");
        socio.setNombre("Pepe");
        socio.setApellidos("Perez");
        socio.setTarjeta(tarjeta);

        // Establecer la relacion con socio
        tarjeta.setSocio(socio);

        // Guardar en la base de datos
        socioRepository.save(socio);
        tarjetaRepository.save(tarjeta);
    }

}

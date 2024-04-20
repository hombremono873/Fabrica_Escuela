package fabricaescuela.fabricaescuela.presentacion;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fabricaescuela.fabricaescuela.core.dominio.Pse;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.IPseServicio;

@RestController
@RequestMapping("/api/pse")
public class PseControlador {
    private IPseServicio servicio;

    public PseControlador(IPseServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listarPse", method = RequestMethod.GET)
    public List<Pse> listarPse() {
        return servicio.listarPse();
    }
}

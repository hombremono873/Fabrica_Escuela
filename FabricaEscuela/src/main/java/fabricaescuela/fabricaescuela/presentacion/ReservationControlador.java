package fabricaescuela.fabricaescuela.presentacion;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fabricaescuela.fabricaescuela.core.dominio.Reservation;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.IReservationServicio;

@RestController
@RequestMapping("/api/reservation")
public class ReservationControlador {
    private IReservationServicio servicio;

    public ReservationControlador(IReservationServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar/reservation", method = RequestMethod.GET)
    public List<Reservation> listarReservation() {
        return servicio.listarReservation();
    }

}

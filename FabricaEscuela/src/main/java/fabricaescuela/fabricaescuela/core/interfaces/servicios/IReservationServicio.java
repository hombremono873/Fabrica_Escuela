package fabricaescuela.fabricaescuela.core.interfaces.servicios;

import java.util.List;

import fabricaescuela.fabricaescuela.core.dominio.Reservation;

public interface IReservationServicio {
   public List<Reservation> listarReservation();
   public Reservation obteneReservation(Long id);
   public Reservation buscarcarReservation(String name, String lastname);
   public Reservation agregarReservation(Reservation reservation);
   public boolean eliminarReservation(Long id);
}

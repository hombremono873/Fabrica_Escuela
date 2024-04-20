package fabricaescuela.fabricaescuela.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import fabricaescuela.fabricaescuela.core.dominio.Reservation;
import fabricaescuela.fabricaescuela.core.interfaces.repositorios.IReservationRepository;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.IReservationServicio;

@Service
public class ReservationServicio implements IReservationServicio{
    private IReservationRepository repositorio;
    public ReservationServicio(IReservationRepository repositorio){
         this.repositorio = repositorio;  
    }
    @Override
    public List<Reservation> listarReservation() {
        return repositorio.findAll();
    }

    @Override
    public Reservation obteneReservation(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obteneReservation'");
    }

    @Override
    public Reservation buscarcarReservation(String name, String lastname) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarcarReservation'");
    }

    @Override
    public Reservation agregarReservation(Reservation reservation) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarReservation'");
    }

    @Override
    public boolean eliminarReservation(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarReservation'");
    }

}

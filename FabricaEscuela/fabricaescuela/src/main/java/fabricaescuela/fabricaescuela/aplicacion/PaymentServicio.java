package fabricaescuela.fabricaescuela.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import fabricaescuela.fabricaescuela.core.dominio.Payment;
import fabricaescuela.fabricaescuela.core.interfaces.repositorios.IPaymentRepository;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.IPaymentServicio;
@Service
public class PaymentServicio implements IPaymentServicio{
    private IPaymentRepository repositorio;
    public PaymentServicio(IPaymentRepository repositorio){
        this.repositorio = repositorio;
    }
    @Override
    public List<Payment> listarPayment() {
        return repositorio.findAll();
    }

    @Override
    public Payment obtenerPayment(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPayment'");
    }

    @Override
    public Payment buscarPayment(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPayment'");
    }

    @Override
    public Payment agregarPayment(Payment payment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarPayment'");
    }

    @Override
    public boolean eliminarPayment(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarPayment'");
    }
    
}

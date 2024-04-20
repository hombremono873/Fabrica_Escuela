package fabricaescuela.fabricaescuela.core.interfaces.servicios;

import java.util.List;

import fabricaescuela.fabricaescuela.core.dominio.Payment;

public interface IPaymentServicio {
    public List<Payment> listarPayment();
    public Payment obtenerPayment(Long id);
    public Payment buscarPayment(Long id);
    public Payment agregarPayment(Payment payment);
    public boolean eliminarPayment(Long id);
}

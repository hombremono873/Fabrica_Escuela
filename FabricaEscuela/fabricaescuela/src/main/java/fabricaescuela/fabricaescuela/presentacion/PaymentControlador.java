package fabricaescuela.fabricaescuela.presentacion;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fabricaescuela.fabricaescuela.core.dominio.Payment;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.IPaymentServicio;

@RestController
@RequestMapping("/api/payment")
public class PaymentControlador {
    private IPaymentServicio servicio;

    public PaymentControlador(IPaymentServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "listarpayment", method = RequestMethod.GET)
    public List<Payment> listarPayment() {
        return servicio.listarPayment();
    }
}

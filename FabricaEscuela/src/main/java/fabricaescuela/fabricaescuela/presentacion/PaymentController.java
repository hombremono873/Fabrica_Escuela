package fabricaescuela.fabricaescuela.presentacion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fabricaescuela.fabricaescuela.core.datos.PaymentRequest;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.IPaymentServicio;

@RestController
@RequestMapping("/api/creditcardpago")
public class PaymentController {

    private final IPaymentServicio servicio;

    public PaymentController(IPaymentServicio servicio) {
        this.servicio = servicio;
    }

    @PostMapping("/processPayment")
    public ResponseEntity<String> processPayment(@RequestBody PaymentRequest request) {
        boolean result = servicio.processPayment(request.getCardNumber(), request.getAmount());
        if (result) {
            return ResponseEntity.ok("Pago exitoso");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se pudo procesar el pago");
        }
    }

    @PostMapping("/processCancelar")
    public ResponseEntity<String> processCancelar(@RequestBody PaymentRequest request) {
        boolean result = servicio.cancelar(request.getCardNumber(), request.getAmount());
        if (result) {
            return ResponseEntity.ok("Cancelación exitosa");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se pudo cancelar el pago");
        }
    }
}

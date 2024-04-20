package fabricaescuela.fabricaescuela.aplicacion;

import org.springframework.stereotype.Service;

import fabricaescuela.fabricaescuela.core.dominio.CreditCard;
import fabricaescuela.fabricaescuela.core.interfaces.repositorios.IPaymentRepository;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.IPaymentServicio;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.PaymentAmountGenerator;
import jakarta.transaction.Transactional;

@Service
public class PaymentServicio implements IPaymentServicio {
    private IPaymentRepository repositorio;
    private PaymentAmountGenerator pago = new PaymentAmountGenerator();

    public PaymentServicio(IPaymentRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    @Transactional
    public boolean processPayment(long cardNumber, float amount) {
        // Buscar la tarjeta de crédito por su número
        CreditCard creditCard = repositorio.findByCardNumber(cardNumber);

        // Verificar si la tarjeta de crédito existe y si tiene saldo suficiente
        if (creditCard != null && creditCard.getSaldo() >= amount) {
            // Realizar el pago actualizando el saldo
            int rowsUpdated = this.repositorio.processPayment(cardNumber, amount);
            return rowsUpdated > 0; // Se actualizó al menos una fila (pago exitoso)
        }

        // No se pudo realizar el pago
        return false;
    }

    @Override
    @Transactional
    public boolean cancelar(long cardNumber, float amount) {
        CreditCard creditCard = repositorio.findByCardNumber(cardNumber);
        amount = this.pago.getRandomAmount(); // Provisional
        if (creditCard != null && creditCard.getSaldo() >= amount) {
            // Actualizar el saldo de la tarjeta de crédito
            float newBalance = creditCard.getSaldo() - amount;
            creditCard.setSaldo(newBalance);
            // Guardar los cambios en la base de datos
            repositorio.save(creditCard);
            return true;
        } else {
            return false;
        }
    }

}

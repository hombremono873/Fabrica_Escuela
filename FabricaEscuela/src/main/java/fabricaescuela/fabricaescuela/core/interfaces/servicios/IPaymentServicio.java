package fabricaescuela.fabricaescuela.core.interfaces.servicios;


public interface IPaymentServicio {
    public boolean processPayment(long cardNumber, float amount); // Actualizado con los parámetros adecuados
    public boolean cancelar(long cardNumber, float amount);
}  

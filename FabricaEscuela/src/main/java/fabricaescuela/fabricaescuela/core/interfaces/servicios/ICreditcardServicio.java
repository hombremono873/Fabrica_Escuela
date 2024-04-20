package fabricaescuela.fabricaescuela.core.interfaces.servicios;

import java.util.List;
import java.util.Optional;

import fabricaescuela.fabricaescuela.core.dominio.CreditCard;

public interface ICreditcardServicio {
    public List<CreditCard> listarCreditCards();

    public CreditCard obtenerCreditCard(Long id);
    //public CreditCard obtenerCreditCardNumber(float number);

    List<CreditCard> obtenerTarjetasDeCreditoPorTitular(String holder);

    public CreditCard agregCreditCard(CreditCard creditcard);

    public boolean eliminarCreditCard(Long id);

    Optional<CreditCard> findByNumber(long number);

    public boolean eliminarCreditCardByNumber(long number);
    public CreditCard modificar(CreditCard creditcard);
}

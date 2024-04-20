package fabricaescuela.fabricaescuela.core.interfaces.servicios;

import java.util.List;
import java.util.Optional;

import fabricaescuela.fabricaescuela.core.dominio.CreditCard;

public interface ICreditcardServicio {
    public List<CreditCard> listarCreditCards();

    public CreditCard obtenerCreditCard(Long id);

    // CreditCard obtenerTarjetaDeCreditoPorTitular(String holder);
    List<CreditCard> obtenerTarjetasDeCreditoPorTitular(String holder);

    public CreditCard agregCreditCard(CreditCard creditcard);

    public boolean eliminarCreditCard(Long id);
    Optional<CreditCard> findByNumber(long number);
}

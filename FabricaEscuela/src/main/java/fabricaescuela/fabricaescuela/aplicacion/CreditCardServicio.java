package fabricaescuela.fabricaescuela.aplicacion;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fabricaescuela.fabricaescuela.core.dominio.CreditCard;
import fabricaescuela.fabricaescuela.core.interfaces.repositorios.ICredicartRepository;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.ICreditcardServicio;

@Service
public class CreditCardServicio implements ICreditcardServicio {
    private final ICredicartRepository repositorio;

    public CreditCardServicio(ICredicartRepository repositorio) {
        this.repositorio = repositorio;
    }

    public List<CreditCard> listarCreditCards() {
        return repositorio.findAll();
    }

    public CreditCard obtenerCreditCard(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    public List<CreditCard> obtenerTarjetasDeCreditoPorTitular(String holder) {
        return repositorio.findByHolder(holder);
    }

    public boolean eliminarCreditCard(Long id) {
        if (repositorio.existsById(id)) {
            repositorio.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public CreditCard agregCreditCard(CreditCard creditcard) {
        return repositorio.save(creditcard);
    }

    @Override
    public Optional<CreditCard> findByNumber(long number) {
        return repositorio.findByNumber(number);
    }

    @Override
    public boolean eliminarCreditCardByNumber(long number) {
        Optional<CreditCard> tarjetaOpt = repositorio.findByNumber(number);
        if (tarjetaOpt.isPresent()) {
            repositorio.delete(tarjetaOpt.get());
            return true; // Se eliminó la tarjeta
        } else {
            return false; // No se encontró la tarjeta con el número especificado
        }
    }

    @Override
    public CreditCard modificar(CreditCard creditcard) {
        var tarjetaExistente = this.repositorio.findById(creditcard.getId());
        if (!tarjetaExistente.isEmpty()) {
            return this.repositorio.save(creditcard);
        }
        return null;
        
    }
}
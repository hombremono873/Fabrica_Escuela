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

}
package fabricaescuela.fabricaescuela.presentacion;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fabricaescuela.fabricaescuela.core.dominio.CreditCard;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.ICreditcardServicio;

@RestController
@RequestMapping("/api/creditcard")
public class CreditCardControlador {
    private ICreditcardServicio servicio;

    public CreditCardControlador(ICreditcardServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listarcredicard", method = RequestMethod.GET)
    public List<CreditCard> listarCreditCards() {
        return servicio.listarCreditCards();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<CreditCard> getCreditCardById(@PathVariable Long id) {
        CreditCard creditCard = servicio.obtenerCreditCard(id);
        if (creditCard != null) {
            return ResponseEntity.ok().body(creditCard);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "/buscarPorHolder", method = RequestMethod.GET)
    public ResponseEntity<List<CreditCard>> buscarPorHolder(@RequestParam String holder) {

        
        List<CreditCard> tarjetas = servicio.obtenerTarjetasDeCreditoPorTitular(holder);
        if (!tarjetas.isEmpty()) {
            return ResponseEntity.ok().body(tarjetas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "/buscarPorNumero/{numero}", method = RequestMethod.GET)
    public ResponseEntity<CreditCard> buscarPorNumero(@PathVariable long numero) {
        Optional<CreditCard> tarjeta = servicio.findByNumber(numero);
        if (tarjeta.isPresent()) {
            return ResponseEntity.ok().body(tarjeta.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public ResponseEntity<CreditCard> agregarCreditCard(@RequestBody CreditCard creditCard) {
        CreditCard nuevaCreditCard = servicio.agregCreditCard(creditCard);
        return ResponseEntity.ok().body(nuevaCreditCard);
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> eliminarCreditCard(@PathVariable Long id) {
        boolean eliminado = servicio.eliminarCreditCard(id);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/eliminarPorNumero/{numero}")
    public ResponseEntity<Void> eliminarCreditCardPorNumero(@PathVariable long numero) {
        boolean eliminado = this.servicio.eliminarCreditCardByNumber(numero);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public CreditCard modificar(@RequestBody CreditCard creditcard) { // @PathVariable indica que en la ruta viene un valor
        return servicio.modificar(creditcard);
    }
    
}

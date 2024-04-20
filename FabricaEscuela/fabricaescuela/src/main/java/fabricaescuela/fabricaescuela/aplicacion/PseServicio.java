package fabricaescuela.fabricaescuela.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import fabricaescuela.fabricaescuela.core.dominio.Pse;
import fabricaescuela.fabricaescuela.core.interfaces.repositorios.IPseRepository;
import fabricaescuela.fabricaescuela.core.interfaces.servicios.IPseServicio;

@Service
public class PseServicio implements IPseServicio {
    private IPseRepository repositorio;

    public PseServicio(IPseRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Pse> listarPse() {
        return this.repositorio.findAll();
    }

    @Override
    public Pse obtenerPse(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public List<Pse> buscarPse(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public Pse agregarPse(Pse pse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public Pse modificarPse(Pse pse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminarPse(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}

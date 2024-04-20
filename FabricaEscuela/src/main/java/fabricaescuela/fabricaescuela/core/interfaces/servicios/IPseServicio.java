package fabricaescuela.fabricaescuela.core.interfaces.servicios;

import java.util.List;

import fabricaescuela.fabricaescuela.core.dominio.Pse;

public interface IPseServicio {
   public List<Pse> listarPse();
   public Pse obtenerPse(Long id);
   public List<Pse> buscarPse(String username);
   public Pse agregarPse(Pse pse);
   public Pse modificarPse(Pse pse);
   public boolean eliminarPse(Long id);
}

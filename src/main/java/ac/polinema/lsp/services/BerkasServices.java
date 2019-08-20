package ac.polinema.lsp.services;

import ac.polinema.lsp.entites.Berkas;

import java.util.List;
import java.util.Optional;

public interface BerkasServices {
    List<Berkas> findAll();
    Optional<Berkas> findById(String id);
    Berkas save(Berkas berkas);
    Berkas update(String id,Berkas berkas);
    void delete(String id);
}

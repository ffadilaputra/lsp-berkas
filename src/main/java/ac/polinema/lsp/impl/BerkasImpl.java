package ac.polinema.lsp.impl;

import ac.polinema.lsp.entites.Berkas;
import ac.polinema.lsp.repositories.BerkasRepository;
import ac.polinema.lsp.services.BerkasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BerkasImpl implements BerkasServices {

    @Autowired
    BerkasRepository berkasRepository;


    @Override
    public List<Berkas> findAll() {
        return berkasRepository.findAll();
    }

    @Override
    public Optional<Berkas> findById(String id) {
        return berkasRepository.findById(id);
    }


    @Override
    public Berkas save(Berkas berkas) {
        return berkasRepository.save(berkas);
    }

    @Override
    public Berkas update(String id, Berkas berkas) {
        berkas.get_id();
        return berkasRepository.save(berkas);
    }

    @Override
    public void delete(String id) {
        berkasRepository.deleteById(id);
    }
}

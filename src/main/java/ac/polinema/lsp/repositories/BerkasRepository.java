package ac.polinema.lsp.repositories;

import ac.polinema.lsp.entites.Berkas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BerkasRepository extends MongoRepository<Berkas, String> {
}

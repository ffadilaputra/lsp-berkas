package ac.polinema.lsp.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Berkas {

    @Id
    private String _id;

    private String username;
    private String bukti_ktp;
    private String pas_foto;
    private String laporan_hasil_studi;
    private String surat_keterangan;

}

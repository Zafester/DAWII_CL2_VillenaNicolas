package pe.edu.cibertec.DAWII_CL2_VillenaNicolas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.DAWII_CL2_VillenaNicolas.model.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {
    Usuarios findByEmail(String email);
    Usuarios findByNomusuarioUsuarios(String nomusuario);
}

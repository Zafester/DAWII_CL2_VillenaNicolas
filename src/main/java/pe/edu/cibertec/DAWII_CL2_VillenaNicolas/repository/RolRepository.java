package pe.edu.cibertec.DAWII_CL2_VillenaNicolas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_CL2_VillenaNicolas.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Rol findByNomRol(String nombrerol);
}

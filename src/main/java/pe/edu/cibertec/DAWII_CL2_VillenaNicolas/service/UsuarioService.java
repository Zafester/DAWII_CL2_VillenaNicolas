package pe.edu.cibertec.DAWII_CL2_VillenaNicolas.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL2_VillenaNicolas.model.Rol;
import pe.edu.cibertec.DAWII_CL2_VillenaNicolas.model.Usuarios;
import pe.edu.cibertec.DAWII_CL2_VillenaNicolas.repository.RolRepository;
import pe.edu.cibertec.DAWII_CL2_VillenaNicolas.repository.UsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;

@Service
@AllArgsConstructor
public class UsuarioService {
private UsuarioRepository usuarioRepository;
private RolRepository rolRepository;
private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

public Usuarios findUserByEmail(String email) {
    return usuarioRepository.findByEmail(email);
}
public Usuarios findUserByUserName(String username){

    return usuarioRepository.findByNomusuarioUsuarios(username);
}
public Usuarios saveUser(Usuarios usuarios){
    usuarios.setPassword(bCryptPasswordEncoder.encode(
            usuarios.getPassword()));
    usuarios.setActivo(true);
    Rol usuarioRol = rolRepository.findByNomRol("ADMIN");
    usuarios.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
    return usuarioRepository.save(usuarios);
}
}

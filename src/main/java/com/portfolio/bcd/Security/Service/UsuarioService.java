package com.portfolio.bcd.Security.Service;

import com.portfolio.bcd.Security.Entity.Usuario;
import com.portfolio.bcd.Security.Repository.IUsuarioRepository;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    IUsuarioRepository iusuariorepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iusuariorepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario) {
        return iusuariorepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email) {
        return iusuariorepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario) {
        iusuariorepository.save(usuario);
    }
}

package com.portfolio.bcd.Security.Service;

import com.portfolio.bcd.Security.Entity.Rol;
import com.portfolio.bcd.Security.Enums.RolNombre;
import com.portfolio.bcd.Security.Repository.IRolRepository;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    IRolRepository irolrepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolrepository.findByRolNombre(rolNombre);
    }
    
    public void saveRol(Rol rol) {
        irolrepository.save(rol);
    }
}

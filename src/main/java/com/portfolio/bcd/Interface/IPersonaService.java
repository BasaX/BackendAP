package com.portfolio.bcd.Interface;

import com.portfolio.bcd.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar usuario por id
    public void deletePersona(Long id);
    
    //Buscar una persona
    public Persona findPersona(Long id);
}

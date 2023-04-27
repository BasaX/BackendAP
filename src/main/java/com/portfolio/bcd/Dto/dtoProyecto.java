package com.portfolio.bcd.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String url;
    @NotBlank
    private String img;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String descripcion, String url, String img) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
}

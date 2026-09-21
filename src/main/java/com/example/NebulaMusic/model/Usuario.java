package com.example.NebulaMusic.model;

public class Usuario {
    private String nombre;
    private String correo;
    private String password;
    private String pseudonimo;
    private String genero;
    private String suscripcion;
    private String fechaNacimiento;
    private String terminos;
    private String comentarios;

    public Usuario() {

    }

    public Usuario(String nombre, String correo, String password, String pseudonimo, String genero, String suscripcion, String fechaNacimiento, String terminos, String comentarios) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.pseudonimo = pseudonimo;
        this.genero = genero;
        this.suscripcion = suscripcion;
        this.fechaNacimiento = fechaNacimiento;
        this.terminos = terminos;
        this.comentarios = comentarios;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getTerminos() {
        return terminos;
    }

    public void setTerminos(String terminos) {
        this.terminos = terminos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

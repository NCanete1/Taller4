package Modelo;

public class Persona {

    private String rut, nombre, email;

    public Persona(String rut, String nombre,String email) {
        if (ValidadorRut.Verificacion(rut)) {
            this.rut = rut;
        } else {
            this.rut = null;
        }
        this.nombre = nombre;
        this.email= email;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (ValidadorRut.Verificacion(rut)) {
            this.rut = rut;
        } else {
            this.rut = null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

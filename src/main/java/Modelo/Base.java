package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Base {
    private List<Persona> personaList;
    private String rut,nombre,email;

    public Base(){
        this.personaList=new ArrayList<Persona>();
    }
    public  List<Persona> getAlumnolist(){return personaList;}

    public void AgregarAlumno(String rutAV, String nombreAV, String emailA){
            try {
                rut = rutAV;
                nombre = nombreAV;
                email = emailA;
                this.personaList.add(new Persona(rut, nombre, email));
            } catch (Exception e) {
                System.out.println("Error Exception en (Añadir Alumno).");
            }
        mostrarAlumno(getAlumnolist());
    }

    public void mostrarAlumno(List<Persona> personaList){
        for(Persona persona : personaList){
            String datos= persona.getNombre()+", "+persona.getRut()+", "+persona.getEmail();
            System.out.println(datos);
        }
    }
 }



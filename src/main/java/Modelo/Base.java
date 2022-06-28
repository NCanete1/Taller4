package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Base {
    private List<Persona> personaList;
    private List<Persona> rutlist;
    private List<Persona> nombrelist;
    private List<Persona> emaillist;
    private String rut,nombre,email;

    public Base(){
        this.personaList=new ArrayList<Persona>();
        this.rutlist=new ArrayList<Persona>();
        this.nombrelist=new ArrayList<Persona>();
        this.emaillist=new ArrayList<Persona>();
    }
    public  List<Persona> getAlumnolist(){return personaList;}

    public List<Persona> getRutlist() {
        return rutlist;
    }

    public void setNombrelist(List<Persona> nombrelist) {
        this.nombrelist = nombrelist;
    }

    public void setEmaillist(List<Persona> emaillist) {
        this.emaillist = emaillist;
    }

    public void AgregarAlumno(String rutAV, String nombreAV, String emailA){
            try {
                rut = rutAV;
                nombre = nombreAV;
                email = emailA;
                this.personaList.add(new Persona(rut, nombre, email));
                this.rutlist.add(new Persona(rut));
                this.nombrelist.add(new Persona(nombre));
                this.emaillist.add(new Persona(email));
            } catch (Exception e) {
                System.out.println("Error Exception en (Añadir Alumno).");
            }
        System.out.println(getAlumnolist().size());
        mostrarAlumno(getAlumnolist());

    }

    public void mostrarAlumno(List<Persona> rutlist){
        for(Persona persona : rutlist){
            String datos= persona.getRut();
            System.out.println(datos);
            getRutlist().get(1);
        }
    }

 }



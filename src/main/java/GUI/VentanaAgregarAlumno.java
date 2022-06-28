package GUI;

import Modelo.Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarAlumno extends JFrame {
    private JLabel text;
    private JLabel labelnombre;
    private JLabel labelrut;
    private JLabel labelcorreo;
    private JTextField nombre;
    private JTextField rut;
    private JTextField correo;
    private JButton bagregar;
    private JButton bcancelar;

    private JLabel test;

    public VentanaAgregarAlumno() {
        Menu();
        pack();
        setVisible(true);
    }

    public void Menu() {
        // Definiendo Componentes
        bagregar = new JButton ("Registrar Alumno");
        text = new JLabel ("Registro Alumno");
        bcancelar = new JButton ("Cancelar");
        nombre = new JTextField (5);
        labelnombre = new JLabel ("Nombre: ");
        labelrut = new JLabel ("Rut: ");
        labelcorreo= new JLabel("Email:");
        rut = new JTextField (5);
        correo = new JTextField (5);
        test = new JLabel();

        // Tamaño y diseño
        setPreferredSize (new Dimension (500, 500));
        setLayout (null);
        this.setTitle("Registro Alumno");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Añadiendo Componentes
        add (bagregar);
        add (text);
        add (bcancelar);
        add (nombre);
        add (labelnombre);
        add (labelrut);
        add(labelcorreo);
        add (rut);
        add (correo);

        add(test);

        // Posicionamiento
        bagregar.setBounds (50, 365, 150, 30);
        text.setBounds (195, 35, 150, 30);
        bcancelar.setBounds (300, 365, 150, 30);
        nombre.setBounds (220, 90, 220, 20);
        labelnombre.setBounds (80, 90, 100, 20);
        labelrut.setBounds (80, 140, 100, 20);
        labelcorreo.setBounds(80,190,100,20);
        rut.setBounds (220, 140, 220, 20);
        correo.setBounds (220, 190, 220, 20);

        test.setBounds(220,280,220,20);

        ActionListener registrar= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Base base= new Base();
                base.AgregarAlumno(rut.getText(),nombre.getText(),correo.getText());
            }
        };
        ActionListener cancelar= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                VentanaCurso ventana= new VentanaCurso();
                ventana.setVisible(true);
                dispose();
            }
        };
        
        //Añadiendo Acciones
        bagregar.addActionListener(registrar);
        bcancelar.addActionListener(cancelar);
    }

}

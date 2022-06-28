package GUI;

import Modelo.Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class VentanaCurso extends JFrame {
        private JButton bregistraralumno;
        private JLabel labelnombre;
        private JLabel labelemail;
        private JTextField nombre;
        private JTextField email;
        private JComboBox rut;

        public VentanaCurso() {
            Menu();
            pack();
            setVisible(true);
        }

        public void Menu() {
            // Cuando intentaba llamar la clases que contenian enum, no aparecian los
            // nombres, lo hice de esta manera funcionaba.
            Base base= new Base();
            String[] rutitems = new String[base.getAlumnolist().size()];
            base.getAlumnolist().toArray(rutitems);

            // Definiendo Componentes
            bregistraralumno = new JButton("Añadir Alumno");
            labelnombre = new JLabel("Nombre:");
            labelemail = new JLabel("Email:");
            nombre = new JTextField(5);
            email = new JTextField(5);
            rut = new JComboBox(rutitems);

            //Desabilitar
            nombre.setEnabled(false);
            email.setEnabled(false);
            //Texto Principal
            rut.setSelectedItem("Rut Estudiantes ICC264");
            nombre.setText("Nombre Estudiante");
            email.setText("Email Estudiante");


            // Tamaño y diseño
            setPreferredSize(new Dimension(500, 500));
            setLayout(null);
            this.setTitle("CURSO ICC264");
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            // Añadiendo Componentes
            add(bregistraralumno);
            add(nombre);
            add(email);
            add(labelnombre);
            add(labelemail);
            add(rut);

            // Posicionamiento
            bregistraralumno.setBounds(50, 365, 150, 30);
            nombre.setBounds(220, 90, 220, 20);
            email.setBounds(220, 140, 220, 20);
            labelnombre.setBounds(60, 90, 100, 20);
            labelemail.setBounds(60, 140, 100, 20);
            rut.setBounds(60,20,220,20);

            ActionListener registrar = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    VentanaAgregarAlumno ventana= new VentanaAgregarAlumno();
                    ventana.setVisible(true);
                    dispose();
                }
            };

            // Añadiendo Acciones
            bregistraralumno.addActionListener(registrar);
            //bcancelar.addActionListener();
        }

    }

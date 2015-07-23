package mx.istmosoft.gynesoft.vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrodePacientes extends JInternalFrame  {

    JLabel linombre, liedad, lidireccion, litelefono, lipeso, lipresion, lifecha, liestado;
    JTextField txtnombre, txtedad, txtdireccion, txttelefono, txtpeso, txtpresion;
    JButton boton, boton1;
    JPanel panel;
    private JComboBox combo, combo1, combo2, combo3;
    JTextArea area;

    public RegistrodePacientes() {

        setTitle("REGISTRO DE PACIENTES");
        linombre = new JLabel("* Nombre del Paciente");
        linombre.setFont(new Font("Times New Roman", 1, 15));
        linombre.setBounds(10, 30, 160, 25);
        txtnombre = new JTextField();
        txtnombre.setBounds(20, 50, 250, 20);

        liedad = new JLabel("Edad");
        liedad.setFont(new Font("Times New Roman", 1, 15));
        liedad.setBounds(300, 30, 80, 20);
        txtedad = new JTextField();
        txtedad.setBounds(300, 50, 60, 20);

        lifecha = new JLabel("Fecha de Nacimiento");
        lifecha.setFont(new Font("Times New Roman", 1, 15));
        lifecha.setBounds(20, 80, 150, 20);

        liestado = new JLabel("Estado Civil");
        liestado.setFont(new Font("Times New Roman", 1, 15));
        liestado.setBounds(300, 80, 80, 20);

        combo = new JComboBox();
        combo1 = new JComboBox();
        combo2 = new JComboBox();
        combo3 = new JComboBox();

        combo.setBounds(20, 100, 80, 20);
        add(combo);
        combo.addItem("Dia");

        combo1.setBounds(110, 100, 80, 20);
        add(combo1);
        combo1.addItem("Mes");

        combo2.setBounds(200, 100, 80, 20);
        add(combo2);
        combo2.addItem("Año");

        combo3.setBounds(300, 100, 80, 20);
        add(combo3);
        combo3.addItem("Estado Civil");

        //////////////////////////////////////////////////////
        lidireccion = new JLabel("*Domicilio(Calle y N°, Colonia, Ciudad)");
        lidireccion.setFont(new Font("Times New Roman", 1, 15));
        lidireccion.setBounds(20, 125, 280, 20);
        txtdireccion = new JTextField();
        txtdireccion.setBounds(20, 150, 360, 20);
        //////////////////////////////////////////////

        litelefono = new JLabel("Telefono");
        litelefono.setFont(new Font("Times New Roman", 1, 15));
        litelefono.setBounds(20, 170, 80, 20);

        txttelefono = new JTextField();
        txttelefono.setBounds(20, 190, 80, 20);

        lipeso = new JLabel("Peso");
        lipeso.setFont(new Font("Times New Roman", 1, 15));
        lipeso.setBounds(110, 170, 80, 20);
        txtpeso = new JTextField();
        txtpeso.setBounds(110, 190, 80, 20);

        lipresion = new JLabel("P/A");
        lipresion.setFont(new Font("Times New Roman", 1, 15));
        lipresion.setBounds(200, 170, 80, 20);
        txtpresion = new JTextField();
        txtpresion.setBounds(200, 190, 80, 20);
        //////////////////////////////////////////////////////

        linombre = new JLabel("* Nombre del Paciente");
        linombre.setFont(new Font("Times New Roman", 1, 15));
        linombre.setBounds(10, 30, 160, 25);

        boton = new JButton("Guardar");
        boton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/imagenes/Guardar.jpg")));
        add(boton);
        setSize(39, 38);
        boton.setBounds(150, 220, 100, 25);
//        boton.addActionListener(this);

        boton1 = new JButton("Cancelar");
        boton1.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/imagenes/Cancel.jpg")));
        add(boton1);
        setSize(39, 38);
        boton1.setBounds(270, 220, 110, 25);
//        boton1.addActionListener(this);

        panel = new JPanel();
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales del Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(0, 0, 255)));

        panel.setLayout(null);

        panel.add(linombre);
        panel.add(liedad);
        panel.add(lidireccion);
        panel.add(litelefono);
        panel.add(lipeso);
        panel.add(lipresion);
        panel.add(lifecha);
        panel.add(liestado);
        panel.add(txtnombre);
        panel.add(txtedad);
        panel.add(txtdireccion);
        panel.add(txttelefono);
        panel.add(txtpeso);
        panel.add(txtpresion);
        panel.add(boton);
        panel.add(boton1);

        panel.add(combo);
        panel.add(combo1);
        panel.add(combo2);
        panel.add(combo3);

        
        setVisible(true);
        setResizable(false);
        
        
        add(panel);
        setSize(410, 300);
        
//setLocationRelativeTo(null); 

    }

    public static void main(String[] args) {
        RegistrodePacientes p = new RegistrodePacientes();
    }

   

    public void actionPerformed(ActionEvent e) {

    }

    private void initComponents() {
        
    }

}

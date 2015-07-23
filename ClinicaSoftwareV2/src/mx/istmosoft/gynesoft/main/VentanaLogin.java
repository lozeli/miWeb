package mx.istmosoft.gynesoft.main;

import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;



public class VentanaLogin extends JFrame {

    ImagenDeFondo f = new ImagenDeFondo();

    JTextField txtUser, txtPass;
    JLabel lblUser, lblPass;
    JButton btnAceptar, btnCancelar;
    String usuario, elPassword;
VentanaLogin() {
        ImagenDeFondo image = new ImagenDeFondo();
        image.setImage("login.jpg");
        setContentPane(image);
        Container contenedor = getContentPane();
//contenedor.setLayout(new FlowLayout());
        //setContentPane(image);
        contenedor.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txtUser = new JTextField();
        txtUser.setBounds(250, 65, 140, 23);
        lblUser = new JLabel("Usuario: ");
        //(X, Y, LARGO, ANCHO);     
        lblUser.setBounds(185, 60, 140, 30);
        //this.getContentPane().add(lblUser,BorderLayout.CENTER);
        txtUser.setToolTipText("Escriba su nombre de usuario");
        //contenedor.add(Box.createVerticalStrut(50));
        contenedor.add(lblUser);
        contenedor.add(txtUser);

        txtPass = new JPasswordField();
        txtPass.setBounds(250, 95, 140, 23);
        lblPass = new JLabel("Contraseña: ");
        lblPass.setBounds(180, 90, 140, 30);
        txtPass.setToolTipText("Escriba su contraseña");
        contenedor.add(lblPass);
        contenedor.add(txtPass);
        //BOTONES PARA LAS FUNCONES
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(200, 120, 80, 25);
        getRootPane().setDefaultButton(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(290, 120, 90, 25);
        contenedor.add(btnAceptar);
        contenedor.add(btnCancelar);

        ActionListener escuchadorbtnAceptar = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (txtUser.getText().length() > 1 && txtPass.getText().length() > 1) {
                        if (validarUsuario(txtUser.getText(), txtPass.getText())) //enviar datos a validar
                        {
//                            setVisible(false);
//                            VentanaPrincipal ventana1 = new VentanaPrincipal();
//                            ventana1.mostrar();
                        } else {
                            JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contraseña no es correcto.");
                            JOptionPane.showMessageDialog(null, txtUser.getText() + " " + txtPass.getText());
                            txtUser.setText("");
                            txtPass.setText("");
                            txtUser.requestFocusInWindow();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe escribir nombre de usuario y contraseña.\n"
                                + "NO puede dejar ningun campo vacio");
                    }
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        };
        btnAceptar.addActionListener(escuchadorbtnAceptar);

        ActionListener escuchadorbtnCancelar = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        };
        btnCancelar.addActionListener(escuchadorbtnCancelar);
        setTitle("Autentificacion de usuarios");

        setSize(450, 270);
        setResizable(false);
        Dimension tamFrame = this.getSize();
        Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tamPantalla.width - tamFrame.width) / 2, (tamPantalla.height - tamFrame.height) / 2);
        setVisible(true);

    }

    boolean validarUsuario(String nombre, String contraseña) throws IOException {
        try {

            Statement instruccionSQL = cn.createStatement();
            ResultSet resultadosConsulta = instruccionSQL.executeQuery("SELECT * FROM usuarios WHERE nick='" + nombre + "' AND contraseña='" + contraseña + "'");

            if (resultadosConsulta.first()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }
    conectar cc = new conectar();
    Connection cn = cc.conexion();
//
// public static void main(String[] args) {
//    VentanaLogin prueba = new VentanaLogin();
//     prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
//  }

}

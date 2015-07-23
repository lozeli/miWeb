/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.istmosoft.gynesoft.main;


    
  import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
 
public class ventanaJframe {

 
    public ventanaJframe(String titulo){
 
        JFrame ventanaM = new JFrame(titulo);
        Dimension d = new Dimension();//objeto para obtener el tamaño de la pantalla
        ImageIcon im = new ImageIcon("istmo.jpg");  



        ventanaM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        ventanaM.setIconImage(im.getImage());//añadiendo un icono a la ventana, obtenemos la imagen del objeto imageicon
        ventanaM.setResizable(false);//para configurar si se redimensiona la ventana
        ventanaM.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra la ventana (x, y)
        ventanaM.setSize(800, 500);//configurando tamaño de la ventana (ancho, alto)
        ventanaM.setVisible(true);//configurando visualización de la ventana        
    
   } 
    public static void main(String []args){
 
        ventanaJframe ventana = new ventanaJframe("Catalago Clinico");  
        
       
}     } 
    

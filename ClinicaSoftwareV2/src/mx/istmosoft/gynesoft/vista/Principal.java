 
package mx.istmosoft.gynesoft.vista;

  import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author emelia
 */
class Principal extends JFrame{



  JDesktopPane desktop = new JDesktopPane();
  int counter = 1;
  int x = 0, y = 0;
  public void buildGUI()
  {
    JMenu menu = new JMenu("Gestion de Pacientes");
    menu.setIcon( new javax.swing.ImageIcon(getClass().getResource("mx.istmosoft.gynesoft.images/gestionpacientes.png")));
    //menu.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("gestionpacientes.png")));
  //  menu.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("catalagoc.jpg")));
    JMenuItem addIF = new JMenuItem("Registro de pacientes");
    addIF.setMnemonic('A');
    menu.add(addIF);
    JMenuBar menuBar = new JMenuBar();
    menuBar.add(menu);
    JMenuItem addIF_1 = new JMenuItem("add internal frame");
    addIF_1.setMnemonic('F');
    addIF_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,0));
    menuBar.add(addIF_1);
 
    JFrame f = new JFrame();
    f.setJMenuBar(menuBar);
    f.getContentPane().add(desktop);
    f.setSize(1000,800);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    addIF.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
//        RegistrodePacientes jif = new ("#"+counter,true,true,true,true);
          //RegistrodePacientes jif= new RegistrodePacientes();
          //JInternalFrame jif = new JInternalFrame("#"+counter,true,true,true,true);
//        
//        jif.setBounds(x,y,50,50);
//        jif.setVisible(true);
//        desktop.add(jif);
          
         // RegistrodePacientes jif= new RegistrodePacientes("#"+counter,true,true,true,true);
          //jif.setBounds(x,y,50,50);
//  jif.setVisible(true);
//   desktop.add(jif);
//     counter++;
// jif.show();
  RegistrodePacientes nuevaFactura = new RegistrodePacientes();
  
  
  nuevaFactura.setIconifiable(true);
  
  nuevaFactura.setMaximizable(true);
  nuevaFactura.setClosable(true);
        desktop.add(nuevaFactura);
     
        nuevaFactura.toFront();
        nuevaFactura.setVisible(true);
//        counter++;
//        x += 50;
//        y += 50;
//        try{jif.setSelected(true);}catch(Exception e){e.printStackTrace();}
      }
    });
    addIF_1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        System.out.println("OK");
      }
    });
  }
  public static void main(String[] args)
  {
      
      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        new Principal().buildGUI();
      }
    });
  }
}


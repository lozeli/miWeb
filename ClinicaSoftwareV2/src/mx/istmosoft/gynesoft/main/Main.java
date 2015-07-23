
package mx.istmosoft.gynesoft.main;

import mx.istmosoft.gynesoft.vista.UIEscritorio;
//import mx.istmosoft.gynesoft.main.Login;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new UIEscritorio().setVisible(true);
                
 
new VentanaLogin().setVisible(true) ;
            }
        });
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.istmosoft.gynesoft.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mx.istmosoft.gynesoft.util.Constantes;
import mx.istmosoft.gynesoft.util.Util;

public class UIEscritorio extends JFrame {

    private final JToolBar miToolBar;
    private final JPanel paneBarraHerramienta;

    public UIEscritorio() {
        setLookAndFeel();
        miToolBar = new JToolBar();
        miToolBar.setFloatable(false);
        miToolBar.setRollover(true);
        paneBarraHerramienta = new JPanel(new BorderLayout());
        paneBarraHerramienta.add(miToolBar, BorderLayout.CENTER);
        paneBarraHerramienta.setBorder(BorderFactory.createBevelBorder(0));

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                exitApplication();
            }
        });

        setLayout(new BorderLayout());
        add(paneBarraHerramienta, BorderLayout.NORTH);
        getContentPane().setBackground(Color.WHITE);
        setSize(Constantes.APP_WIDTH, Constantes.APP_HEIGHT);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setTitle(Constantes.TITLE_APPLICATION + " :: " + Constantes.ENTERPRISE);

    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Util.log(ex, UIEscritorio.class);
        } catch (InstantiationException ex) {
            Util.log(ex, UIEscritorio.class);
        } catch (IllegalAccessException ex) {
            Util.log(ex, UIEscritorio.class);
        } catch (UnsupportedLookAndFeelException ex) {
            Util.log(ex, UIEscritorio.class);
        }

    }

    public void exitApplication() {
        if (JOptionPane.showConfirmDialog(this, Constantes.SALIR_APP, Constantes.TITLE_APPLICATION, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit( 0 );
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.istmosoft.gynesoft.util;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextField;


public abstract class Util {

    public static void log(Exception ex, Class clase) {
        Logger logger = Logger.getLogger("MyLog");
        logger.setUseParentHandlers(false);
        FileHandler fh;
        try {
            fh = new FileHandler("logger.log", true);
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
            String text = clase.getName() + "\n" + ex.toString();
            logger.info(text);
            fh.close();
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void log(String msj, Class clase) {
        Logger logger = Logger.getLogger("MyLog");
        logger.setUseParentHandlers(false);
        FileHandler fh;
        try {
            fh = new FileHandler("logger.log", true);
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
            String text = clase.getName() + "\n" + msj;
            logger.info(text);
            fh.close();
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


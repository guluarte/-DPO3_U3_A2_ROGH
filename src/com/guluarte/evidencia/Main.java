/*
 Actividad 3. Lectura de archivos
 En esta actividad deberás crear un programa que lea un archivo y muestre su contenido en una 
 ventana. Con lo que demostrarás la comprensión de la lectura de archivos así como de los 
 componentes gráficos vistos en DPO2.
 Propósito: Crear un programa que lea archivos.
 Ahora es necesario que sigas las siguientes Instrucciones:


 1.  Identifica los componentes y la estructura requerida para la lectura de archivos; apóyate
 de las fuentes que consultaste.
 2.  Desarrolla la interfaz gráfica del programa, ésta deberá tener al menos un botón para 
 localizar el archivo y el área de texto donde se reflejará el archivo que se lea.
 3.  Desarrolla el método que cargará el archivo desde su directorio y lo muestre en el área de 
 texto creada con este fin.
 4.  Guarda la carpeta del proyecto con el nombre DPO3_U1_A3_XXYZ. Sustituye las XX por 
 las dos primeras letras del primer nombre, la Y por la inicial del apellido paterno y la Z por la 
 inicial del apellido materno.
 5.  Ingresa al apartado de tareas y sube tu archivo.
 6.  Envía el archivo al facilitador(a) para recibir retroalimentación.
 6.  Consulta la rúbrica de evaluación de la actividad que encontrarás en el archivo Instrumentos 
 de evaluación.
 */
package com.guluarte.evidencia;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author rodolfo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaPrincipal(new ManipuladorDeArchivos()).setVisible(true);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchPaddingException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeyException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidAlgorithmParameterException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
       
    }

}

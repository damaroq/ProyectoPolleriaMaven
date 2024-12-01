package com.utp.proyectopolleria;

import PresentationLayer.PantallaInicioSesion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ProyectoPolleria {

    public static void main(String[] args) {
        try {
            // Ejecuta en el Event Dispatch Thread (EDT) para asegurar la actualización de la interfaz gráfica.
            SwingUtilities.invokeLater(() -> {
                PantallaInicioSesion pantalla = new PantallaInicioSesion();
                pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                System.out.println("Mostrando PantallaInicioSesion...");
                pantalla.setVisible(true);  // Hace visible la pantalla de inicio de sesión
            });
        } catch (Exception ex) {
            Logger.getLogger(ProyectoPolleria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

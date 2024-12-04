package componentes;

import static PresentationLayer.AdministradorMenu.btnPlatosComida;
import static PresentationLayer.AdministradorMenu.btnProductos;
import static PresentationLayer.AdministradorMenu.btnSalir;
import static PresentationLayer.AdministradorMenu.btnUsuarios;
import static PresentationLayer.AdministradorMenu.btnVentas;
import static PresentationLayer.AdministradorMenu.jlPlatosComida;
import static PresentationLayer.AdministradorMenu.jlProductos;
import static PresentationLayer.AdministradorMenu.jlSalir;
import static PresentationLayer.AdministradorMenu.jlUsuarios;
import static PresentationLayer.AdministradorMenu.jlVentas;
import java.awt.Color;
import javax.swing.JLabel;

public class AnimatedButtonAdmin {

    private void mostrarColor(PanelGradient paneX, PanelGradient paneZ, JLabel lblx) {
        paneX.setBackground(new Color(255, 125, 14));//Color a mostrar
        paneZ.setColorGradient(new Color(255, 125, 14));//Color a mostrar

    }

    private void establecColor(PanelGradient paneX, PanelGradient paneZ, JLabel lblx) {
        paneX.setBackground(new Color(255, 255, 255));//Color por defecto
        paneZ.setColorGradient(new Color(255, 255, 255));//Color por defecto
    }

    public void AnimattUsuarios() {
        mostrarColor(btnUsuarios, btnUsuarios, jlUsuarios);
        establecColor(btnPlatosComida, btnPlatosComida, jlPlatosComida);
        establecColor(btnProductos, btnProductos, jlProductos);
        establecColor(btnVentas, btnVentas, jlVentas);
        establecColor(btnSalir, btnSalir, jlSalir);
    }

    public void AnimattPlatosComida() {
        mostrarColor(btnPlatosComida, btnPlatosComida, jlPlatosComida);
        establecColor(btnUsuarios, btnUsuarios, jlUsuarios);
        establecColor(btnProductos, btnProductos, jlProductos);
        establecColor(btnVentas, btnVentas, jlVentas);
        establecColor(btnSalir, btnSalir, jlSalir);
    }

    public void AnimattProductos() {
        mostrarColor(btnProductos, btnProductos, jlProductos);
        establecColor(btnUsuarios, btnUsuarios, jlUsuarios);
        establecColor(btnPlatosComida, btnPlatosComida, jlPlatosComida);
        establecColor(btnVentas, btnVentas, jlVentas);
        establecColor(btnSalir, btnSalir, jlSalir);
    }

    public void AnimattVentas() {
        mostrarColor(btnVentas, btnVentas, jlVentas);
        establecColor(btnUsuarios, btnUsuarios, jlUsuarios);
        establecColor(btnPlatosComida, btnPlatosComida, jlPlatosComida);
        establecColor(btnProductos, btnProductos, jlProductos);
        establecColor(btnSalir, btnSalir, jlSalir);
    }

    public void AnimattSalir() {
        mostrarColor(btnSalir, btnSalir, jlSalir);
        establecColor(btnUsuarios, btnUsuarios, jlUsuarios);
        establecColor(btnPlatosComida, btnPlatosComida, jlPlatosComida);
        establecColor(btnProductos, btnProductos, jlProductos);
        establecColor(btnVentas, btnVentas, jlVentas);
    }
}

package componentes;

import java.awt.Color;
import javax.swing.JLabel;
import static PresentationLayer.MeseroMenu.btn_mesas;
import static PresentationLayer.MeseroMenu.btn_reporte;
import static PresentationLayer.MeseroMenu.btn_salir;
import static PresentationLayer.MeseroMenu.iconMesas;
import static PresentationLayer.MeseroMenu.iconReporte;
import static PresentationLayer.MeseroMenu.iconSalir;
import static PresentationLayer.MeseroMenu.jlMesas;
import static PresentationLayer.MeseroMenu.jlReporte;
import static PresentationLayer.MeseroMenu.jlSalir;

public class AnimatedButtonMesero {

    private void mostrarColor(PanelGradient paneX, PanelGradient paneZ, JLabel lblx, JLabel lbly, String url) {
        paneX.setBackground(new Color(255, 125, 14));//Color a mostrar
        paneZ.setColorGradient(new Color(255, 125, 14));//Color a mostrar
    }

    private void establecColor(PanelGradient paneX, PanelGradient paneZ, JLabel lblx, JLabel lbly, String url) {
        paneX.setBackground(new Color(255, 255, 255));//Color por defecto
        paneZ.setColorGradient(new Color(255, 255, 255));//Color por defecto
    }

    public void AnimattReporte() {
        mostrarColor(btn_reporte, btn_reporte, jlReporte, iconReporte, "/icons/reporte.png");
        establecColor(btn_mesas, btn_mesas, jlMesas, iconMesas, "/icons/mesa.png");
        establecColor(btn_salir, btn_salir, jlSalir, iconSalir, "/icons/cerrar-sesion.png");
    }

    public void AnimattMesas() {
        mostrarColor(btn_mesas, btn_mesas, jlMesas, iconMesas, "/icons/mesa.png");
        establecColor(btn_reporte, btn_reporte, jlReporte, iconReporte, "/icons/reporte.png");
        establecColor(btn_salir, btn_salir, jlSalir, iconSalir, "/icons/cerrar-sesion.png");
    }

    public void AnimattSalir() {
        mostrarColor(btn_salir, btn_salir, jlSalir, iconSalir, "/icons/cerrar-sesion.png");
        establecColor(btn_reporte, btn_reporte, jlReporte, iconReporte, "/icons/reporte.png");
        establecColor(btn_mesas, btn_mesas, jlMesas, iconMesas, "/icons/mesa.png");
    }
}

package componentes;

import static PresentationLayer.CajeroMenu.btnMesas;
import static PresentationLayer.CajeroMenu.btnRegistroReserva;
import static PresentationLayer.CajeroMenu.btnResumenCaja;
import static PresentationLayer.CajeroMenu.btnSalir;
import static PresentationLayer.CajeroMenu.jlMesas;
import static PresentationLayer.CajeroMenu.jlRegistroReserva;
import static PresentationLayer.CajeroMenu.jlResumenCaja;
import static PresentationLayer.CajeroMenu.jlSalir;
import java.awt.Color;
import javax.swing.JLabel;

public class AnimatedButtonCajero {

    private void mostrarColor(PanelGradient paneX, PanelGradient paneZ, JLabel lblx) {
        paneX.setBackground(new Color(255, 125, 14));//Color a mostrar
        paneZ.setColorGradient(new Color(255, 125, 14));//Color a mostrar
    }

    private void establecColor(PanelGradient paneX, PanelGradient paneZ, JLabel lblx) {
        paneX.setBackground(new Color(255, 255, 255));//Color por defecto
        paneZ.setColorGradient(new Color(255, 255, 255));//Color por defecto
    }
    
    public void AnimattMesas() {
        mostrarColor(btnMesas, btnMesas, jlMesas);
        establecColor(btnResumenCaja, btnResumenCaja, jlResumenCaja);
        establecColor(btnRegistroReserva, btnRegistroReserva, jlRegistroReserva);
        establecColor(btnSalir, btnSalir, jlSalir);
    }

    public void AnimattResumenCaja() {
        mostrarColor(btnResumenCaja, btnResumenCaja, jlResumenCaja);
        establecColor(btnMesas, btnMesas, jlMesas);
        establecColor(btnRegistroReserva, btnRegistroReserva, jlRegistroReserva);
        establecColor(btnSalir, btnSalir, jlSalir);
    }
    
    public void AnimattRegistroReserva() {
        mostrarColor(btnRegistroReserva, btnRegistroReserva, jlRegistroReserva);
        establecColor(btnMesas, btnMesas, jlMesas);
        establecColor(btnResumenCaja, btnResumenCaja, jlResumenCaja);
        establecColor(btnSalir, btnSalir, jlSalir);
    }

    public void AnimattSalir() {
        mostrarColor(btnSalir, btnSalir, jlSalir);
        establecColor(btnMesas, btnMesas, jlMesas);
        establecColor(btnResumenCaja, btnResumenCaja, jlResumenCaja);
        establecColor(btnRegistroReserva, btnRegistroReserva, jlRegistroReserva);
    }
}

package Controladores;

import Modelos.PreguntaDao;
import Vistas.Menu_Principal;
import Vistas.Test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {

    private PreguntaDao preguntaDao;
    private Menu_Principal menuPrincipal;

    public MenuController(Menu_Principal menuPrincipal, PreguntaDao preguntaDao) {
        this.preguntaDao = preguntaDao;
        this.menuPrincipal = menuPrincipal;
        this.menuPrincipal.menu_button_estudiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuPrincipal.menu_button_estudiar) {
            Test testView = new Test();
            testView.setVisible(true);
            this.menuPrincipal.dispose();
            
        }
    }

}

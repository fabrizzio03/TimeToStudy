package Controladores;

import Modelos.Pregunta;
import Modelos.PreguntaDao;
import Vistas.Menu_Principal;
import Vistas.Resultados;
import Vistas.Test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreguntaController implements ActionListener {

    private Pregunta pregunta;
    private PreguntaDao preguntaDao;
    private Menu_Principal menuView;
    private Test testView;
    private Resultados resultadosView;

    public PreguntaController(Pregunta pregunta, PreguntaDao preguntaDao, Menu_Principal menuView, Test testView, Resultados resultadosView) {
        this.pregunta = pregunta;
        this.preguntaDao = preguntaDao;
        this.menuView = menuView;
        this.testView = testView;
        this.resultadosView = resultadosView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

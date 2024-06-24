package Modelos;

public class Pregunta {

    private int id;
    private String pregunta;
    private String respuesta;
    private int puntuacion;

    public Pregunta() {
    }

    public Pregunta(int id, String pregunta, String respuesta, int puntuacion) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.puntuacion = puntuacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

}

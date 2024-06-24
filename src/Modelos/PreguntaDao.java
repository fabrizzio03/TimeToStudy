package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PreguntaDao {

    //Instanciar la conexion
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Listar las preguntas donde la puntuacion es menor a 10
    public List listarPreguntas() {
        List<Pregunta> list_preguntas = new ArrayList();
        String query = "SELECT * FROM anfeca2024 WHERE puntuacion < 10";
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Pregunta pregunta = new Pregunta();
                pregunta.setId(rs.getInt("id"));
                pregunta.setPregunta(rs.getString("pregunta"));
                pregunta.setRespuesta(rs.getString("respuesta"));
                pregunta.setPuntuacion(rs.getInt("puntuacion"));
                list_preguntas.add(pregunta);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_preguntas;
    }

    //Listar todas las preguntas
    public List listarAllPreguntas() {
        List<Pregunta> list_preguntas = new ArrayList();
        String query = "SELECT * FROM anfeca2024";
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Pregunta pregunta = new Pregunta();
                pregunta.setId(rs.getInt("id"));
                pregunta.setPregunta(rs.getString("pregunta"));
                pregunta.setRespuesta(rs.getString("respuesta"));
                pregunta.setPuntuacion(rs.getInt("puntuacion"));
                list_preguntas.add(pregunta);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_preguntas;
    }
    
    //Actualizar puntuacion de la pregunta
    public boolean actualizarPuntuacion(int id, int puntuacion){
        String query = "UPDATE anfeca2024 SET puntuacion = "+puntuacion+" "
                + "WHERE id = "+id;
        try{
        conn = cn.getConnection();
        pst = conn.prepareStatement(query);
        pst.execute();
        return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar la puntuacion "+e.getMessage());
            return false;
        }
    }
}

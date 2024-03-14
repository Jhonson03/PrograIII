package ejercicio_jhonsonleiva;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author jhons
 */
public class Ejercicio_JhonsonLeiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion db = new Conexion();
        Connection cx = db.conectar();
        
        if (cx != null) {
            JOptionPane.showMessageDialog(null, "Conexión establecida con la base de datos.");
            
            // Menú principal
            while (true) {
                String[] options = {"Ver registros de la tabla estudiante", "Ver registros de la tabla materias", "Salir"};
                int option = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú principal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                switch (option) {
                    case 0:
                        verEstudiantes(cx);
                        break;
                    case 1:
                        verMaterias(cx);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo establecer conexión con la base de datos.");
        }
    }
    
    public static void verEstudiantes(Connection cx) {
        try {
            String query = "SELECT * FROM estudiante";
            PreparedStatement statement = cx.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            StringBuilder message = new StringBuilder("Registros de la tabla estudiante:\n");
            while (resultSet.next()) {
                message.append("ID: ").append(resultSet.getInt("id")).append(", Nombre: ").append(resultSet.getString("nombre")).append("\n");
            }
            JOptionPane.showMessageDialog(null, message.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al recuperar datos de la tabla estudiante: " + ex.getMessage());
        }
    }
    
    public static void verMaterias(Connection cx) {
        try {
            String query = "SELECT * FROM materia";
            PreparedStatement statement = cx.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            StringBuilder message = new StringBuilder("Registros de la tabla materias:\n");
            while (resultSet.next()) {
                message.append("ID: ").append(resultSet.getInt("id")).append(", Nombre: ").append(resultSet.getString("nombre")).append("\n");
            }
            JOptionPane.showMessageDialog(null, message.toString());
            
            String input = JOptionPane.showInputDialog(null, "Ingrese el ID de la materia que desea ver:");
            int idMateria = Integer.parseInt(input);
            
            String estudiantesQuery = "SELECT e.nombre FROM estudiante e INNER JOIN materia em ON e.id = em.id WHERE em.id = ?";
            PreparedStatement estudiantesStatement = cx.prepareStatement(estudiantesQuery);
            estudiantesStatement.setInt(1, idMateria);
            ResultSet estudiantesResultSet = estudiantesStatement.executeQuery();
            
            StringBuilder estudiantesMessage = new StringBuilder("Estudiantes inscritos en la materia seleccionada:\n");
            while (estudiantesResultSet.next()) {
                estudiantesMessage.append(estudiantesResultSet.getString("nombre")).append("\n");
            }
            JOptionPane.showMessageDialog(null, estudiantesMessage.toString());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al recuperar datos de la tabla materias: " + ex.getMessage());
        }    
    }
}

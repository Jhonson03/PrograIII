import javax.swing.*;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String Nom, Apellido;

        Nom = JOptionPane.showInputDialog("Ingrese su nombre ");
        Apellido = JOptionPane.showInputDialog("Ingrese su apellido ");

        JOptionPane.showMessageDialog(null, String.format("Bienvenido: %s %s",Nom, Apellido));
    }
}
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        /*Escribir un programa que determine cuál es el mayor número de 3 ingresados por el usuario. */

        String frase1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        double num1 = Double.parseDouble(frase1);

        String frase2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        double num2 = Double.parseDouble(frase2);

        String frase3 = JOptionPane.showInputDialog("Ingrese el tercer número:");
        double num3 = Double.parseDouble(frase3);

        double mayor = Math.max(num1, Math.max(num2, num3));

        JOptionPane.showMessageDialog(null, "El mayor número es: " + mayor);
    }
}
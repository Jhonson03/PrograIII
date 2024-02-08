import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Escriba un programa que calcule las 4 operaciones básicas
        (suma, resta, multiplicación y división), ingresando 2 valores.*/

        double num1, num2, suma, resta, multi, divi;
        String frase1, frase2;

        do {
            JOptionPane.showMessageDialog(null, "\tBienvenido\nA continuacion ingrese 2 numeros\nel resultado sera las 4 operaciones basicas");
            frase1 = JOptionPane.showInputDialog("Ingrese el primer valor \n(puede cancelar para salir)");
            frase2 = JOptionPane.showInputDialog("Ingrese el segundo valor \n(puede cancelar para salir)");

            if (frase1 == null || frase2 == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada. Saliendo del programa.");
                System.exit(0);
            }

            num1 = Double.parseDouble(frase1);
            num2 = Double.parseDouble(frase2);

            if (num2 == 0) {
                JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero. Por favor, ingrese los números nuevamente.");
            }
        } while (num2 == 0);

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;

        JOptionPane.showMessageDialog(null, "Suma: " + suma + "\nResta: " + resta + "\nMultiplicación: " + multi + "\nDivisión: " + divi);
    }
}
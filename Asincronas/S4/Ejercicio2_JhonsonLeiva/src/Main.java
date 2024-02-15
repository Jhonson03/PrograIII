import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /* Escriba un programa que permita ingresar números del teclado y calcular si es un
        número par, o impar hasta que el número ingresado sea menor o igual que 50. */

        String strNumero;
        int numero;

        do {
            strNumero = JOptionPane.showInputDialog("Introduzca un número: ");
            numero = Integer.parseInt(strNumero);

            if (numero <= 50) {
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "El número " + numero + " es par.");
                } else {
                    JOptionPane.showMessageDialog(null, "El número " + numero + " es impar.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El número debe ser menor o igual que 50.");
            }
        } while (numero > 50);
    }
}
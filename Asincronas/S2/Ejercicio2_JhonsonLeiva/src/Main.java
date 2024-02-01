import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String primerNumero, segundoNumero;
        int num1, num2, suma;

        primerNumero = JOptionPane.showInputDialog("Escriba el primer entero: ");
        segundoNumero = JOptionPane.showInputDialog("Escriba el segundo entero: ");

        num1 = Integer.parseInt(primerNumero);
        num2 = Integer.parseInt(segundoNumero);

        suma = num1 + num2;

        JOptionPane.showMessageDialog(null, "la suma es "+ suma, "resultados", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
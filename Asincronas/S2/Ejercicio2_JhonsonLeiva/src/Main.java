import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String primerNumero, segundoNumero, tercerNumero;
        float num1, num2, num3, suma, resta, multiplicacion;

        primerNumero = JOptionPane.showInputDialog("Escriba el primer entero: ");
        segundoNumero = JOptionPane.showInputDialog("Escriba el segundo entero: ");
        tercerNumero = JOptionPane.showInputDialog("Escriba el tercer entero: ");

        num1 = Integer.parseInt(primerNumero);
        num2 = Integer.parseInt(segundoNumero);
        num3 = Integer.parseInt(tercerNumero);

        suma = num1 + num2 + num3;
        resta = num1 - num2 - num3;
        multiplicacion = num1 * num2 * num3;

        JOptionPane.showMessageDialog(null, String.format("La suma es: %.2f\nLa resta es: %.2f\nLa multiplicacion es: %.2f",suma,resta, multiplicacion), "resultados", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}